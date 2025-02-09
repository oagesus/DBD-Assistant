package com.example.dbdguide;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ButtonAdapterMaps extends RecyclerView.Adapter<ButtonAdapterMaps.ButtonViewHolder> {

    private final List<MapItem> originalButtonItems;
    private List<MapItem> filteredButtonItems;
    private final Context context;

    // Constructor
    public ButtonAdapterMaps(Context context, List<MapItem> buttonItems) {
        this.context = context;
        this.originalButtonItems = buttonItems;
        this.filteredButtonItems = new ArrayList<>(buttonItems); // Initialize with the full list
    }

    @NonNull
    @Override
    public ButtonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout containing only the ImageView
        View view = LayoutInflater.from(context).inflate(R.layout.button_item_map, parent, false);
        return new ButtonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtonViewHolder holder, int position) {
        MapItem buttonItem = filteredButtonItems.get(position);

        // Set the icon for the button
        holder.iconView.setImageResource(buttonItem.getMapPreviewResId());

        // Set a click listener for the button container (directly on the ImageView)
        holder.iconView.setOnClickListener(v -> {
            String buttonText = buttonItem.getLabel();
            int mapResId = buttonItem.getMapResId();
            showPopupWindow(v, buttonText, mapResId);  // Pass the label and mapResId to show popup
        });
    }

    @Override
    public int getItemCount() {
        return filteredButtonItems.size();
    }

    // Method to show the popup window when a button is clicked
    private void showPopupWindow(View anchorView, String buttonText, int mapResId) {
        // Inflate the popup layout
        View popupView = LayoutInflater.from(context).inflate(R.layout.map_popup, null);

        // Get the screen width
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenWidth = displayMetrics.widthPixels;

        // Create the PopupWindow with the calculated dimensions
        PopupWindow popupWindow = new PopupWindow(
                popupView,
                screenWidth,
                (int) (screenWidth * 1)
        );

        // Set up the button replica
        ImageView replicaIcon = popupView.findViewById(R.id.replica_icon);
        replicaIcon.setImageResource(mapResId);

        // Set up the LinearLayout for popup_title
        LinearLayout linearLayout = popupView.findViewById(R.id.popup_title);
        linearLayout.removeAllViews(); // Clear any existing views

        // Split the buttonText by newlines
        String[] lines = buttonText.split("\n"); // Split by newline for multi-line text

        // Add TextViews dynamically
        for (String line : lines) {
            TextView textView = new TextView(context);

            // Use Html.fromHtml() to parse HTML tags in the text
            textView.setText(Html.fromHtml(line, Html.FROM_HTML_MODE_LEGACY));

            // Set font size to 22sp
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 22); // Use TypedValue for SP
            textView.setTextColor(Color.parseColor("#aaa9a9"));
            textView.setPadding(4, 4, 4, 4); // Add padding
            textView.setFocusable(true);
            textView.setFocusableInTouchMode(true);

            // Add the TextView to the LinearLayout
            linearLayout.addView(textView);
        }

        // Reference the close button and set a click listener
        View closeButton = popupView.findViewById(R.id.close_popup);
        closeButton.setOnClickListener(v -> popupWindow.dismiss());

        // Dismiss logic when clicking outside the popup
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);

        // **Dim only the SearchView (and optionally other specific views)**

        // Find the SearchView
        SearchView searchView = ((Activity) context).findViewById(R.id.search_view);

        Spinner spinner = ((Activity) context).findViewById(R.id.spinner);

        LinearLayout searchbar = ((Activity) context).findViewById(R.id.searchbar);

        // Dim the SearchView by changing its background color or alpha
        if (searchView != null) {
            searchView.setAlpha(0.3f); // Reduce the alpha (make it semi-transparent)
        }

        if (searchbar != null) {
            searchbar.setBackgroundColor(Color.parseColor("#80000000"));
        }

        if (spinner != null) {
            spinner.setAlpha(0.3f); // Reduce the alpha (make it semi-transparent)
        }

        // Set up the background dimming effect
        View backgroundOverlay = ((Activity) context).findViewById(R.id.background_overlay);
        if (backgroundOverlay != null) {
            backgroundOverlay.setVisibility(View.VISIBLE); // Show the dimmed overlay
        }

        // Close the overlay and restore the SearchView when the popup is dismissed
        popupWindow.setOnDismissListener(() -> {
            if (backgroundOverlay != null) {
                backgroundOverlay.setVisibility(View.GONE); // Hide the overlay when popup is dismissed
            }

            // Restore SearchView state after the popup is dismissed
            if (searchView != null) {
                searchView.setAlpha(1f); // Restore full opacity
            }

            if (searchbar != null) {
                searchbar.setBackgroundColor(Color.parseColor("#282828"));
            }

            if (spinner != null) {
                spinner.setAlpha(1f); // Restore full opacity
            }
        });

        // Show the popup window centered on the screen
        popupWindow.showAtLocation(anchorView, Gravity.CENTER, 0, 0);
    }

    // Method to filter the buttons based on the search query
    public void filter(String query) {
        if (query.isEmpty()) {
            filteredButtonItems = new ArrayList<>(originalButtonItems);
        } else {
            List<MapItem> filteredList = new ArrayList<>();
            String queryLower = query.toLowerCase(); // Make the query lowercase once to optimize

            for (MapItem item : originalButtonItems) {
                String itemLabel = item.getLabel().toLowerCase();
                String itemMapName = item.getMapName().toLowerCase(); // Get mapName and convert to lowercase

                // Check if query is found anywhere in either label or mapName
                if (itemLabel.contains(queryLower) || itemMapName.contains(queryLower)) {
                    filteredList.add(item);
                }
            }

            filteredButtonItems = filteredList;
        }
        notifyDataSetChanged();
    }

    // Method to update the items dynamically, for example, after sorting
    public void updateItems(List<MapItem> newItems) {
        this.filteredButtonItems = new ArrayList<>(newItems);
        notifyDataSetChanged(); // Notify the adapter to refresh the RecyclerView
    }

    // Method to sort the items alphabetically (A-Z)
    public void sortItems(boolean isAscending) {
        Collections.sort(filteredButtonItems, new Comparator<MapItem>() {
            @Override
            public int compare(MapItem item1, MapItem item2) {
                int comparisonResult = item1.getLabel().compareToIgnoreCase(item2.getLabel());
                return isAscending ? comparisonResult : -comparisonResult; // Invert comparison for Z-A
            }
        });
        notifyDataSetChanged(); // Refresh the RecyclerView after sorting
    }

    // ViewHolder class for the buttons
    public static class ButtonViewHolder extends RecyclerView.ViewHolder {
        ImageView iconView; // Icon view reference

        public ButtonViewHolder(@NonNull View itemView) {
            super(itemView);
            iconView = itemView.findViewById(R.id.button_icon); // Initialize the ImageView
        }
    }
}
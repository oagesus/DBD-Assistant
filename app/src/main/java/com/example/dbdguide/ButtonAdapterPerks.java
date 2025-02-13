package com.example.dbdguide;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.SearchView;

import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ButtonAdapterPerks extends RecyclerView.Adapter<ButtonAdapterPerks.ButtonViewHolder> {

    private final List<PerkItem> originalButtonItems;
    private List<PerkItem> filteredButtonItems;
    private final Context context;

    // Constructor
    public ButtonAdapterPerks(Context context, List<PerkItem> buttonItems) {
        this.context = context;
        this.originalButtonItems = buttonItems;
        this.filteredButtonItems = new ArrayList<>(buttonItems); // Initialize with the full list
    }

    @NonNull
    @Override
    public ButtonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the FrameLayout layout
        View view = LayoutInflater.from(context).inflate(R.layout.button_item_perk, parent, false);
        return new ButtonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtonViewHolder holder, int position) {
        PerkItem buttonItem = filteredButtonItems.get(position);

        // Set the icon for the button
        holder.iconView.setImageResource(buttonItem.getIconResId());

        // Set a click listener for the button container
        holder.buttonContainer.setOnClickListener(v -> {
            String buttonText = buttonItem.getLabel();
            String buttonDescription = buttonItem.getDescription();
            int iconResId = buttonItem.getIconResId();
            List<String> tagTexts = buttonItem.getTags();  // Get the tags for the perk

            // Retrieve the characterBackgroundOverlay from the character popup layout
            View characterBackgroundOverlay = ((Activity) context).findViewById(R.id.background_overlay_character);

            ImageView characterPortraitKiller =  ((Activity) context).findViewById(R.id.character_portrait_killer);

            ImageView replicaIconKiller =  ((Activity) context).findViewById(R.id.replica_icon_killer);

            WebView popupDescription = ((Activity) context).findViewById(R.id.popup_description);

            WebView popupDescription2 = ((Activity) context).findViewById(R.id.popup_description_2);

            TextView popupTitleKiller = ((Activity) context).findViewById(R.id.popup_title_killer);

            View closeButtonKiller = ((Activity) context).findViewById(R.id.close_popup_killer);

            FrameLayout squareContainerPerks = ((Activity) context).findViewById(R.id.square_container_perks);

            ConstraintLayout textContainerShrine = ((Activity) context).findViewById(R.id.text_container_shrine);

            ConstraintLayout containerPerksShrine = ((Activity) context).findViewById(R.id.container_perks_shrine);

            Button buttonGenerate = ((Activity) context).findViewById(R.id.button_generate);

            // Call showPopupWindow with all 6 arguments
            showPopupWindow(v, buttonText, buttonDescription, iconResId, tagTexts, characterBackgroundOverlay, characterPortraitKiller, replicaIconKiller, popupDescription, popupDescription2, popupTitleKiller, closeButtonKiller, squareContainerPerks, textContainerShrine, containerPerksShrine, buttonGenerate);
        });
    }

    @Override
    public int getItemCount() {
        return filteredButtonItems.size();
    }

    // Override getItemViewType if you want to handle multiple item types
    @Override
    public int getItemViewType(int position) {
        return 0; // For now, it returns the same value for all items (single item type).
    }

    public void showPopupWindow(View anchorView, String buttonText, String buttonDescription, int iconResId, List<String> tagTexts, View characterBackgroundOverlay, ImageView characterPortraitKiller, ImageView replicaIconKiller, WebView popupDescription, WebView popupDescription2, TextView popupTitleKiller, View closeButtonKiller, FrameLayout squareContainerPerks, ConstraintLayout textContainerShrine, ConstraintLayout containerPerksShrine, Button buttonGenerate) {
        // Inflate the popup layout
        View popupView = LayoutInflater.from(context).inflate(R.layout.perk_popup, null);

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
        FrameLayout buttonReplicaContainer = popupView.findViewById(R.id.button_replica_container);
        ImageView replicaIcon = buttonReplicaContainer.findViewById(R.id.replica_icon);
        replicaIcon.setImageResource(iconResId);

        // Set up the popup elements
        TextView popupTitle = popupView.findViewById(R.id.popup_title);
        WebView webViewDescription = popupView.findViewById(R.id.popup_description);

        // Set the WebView background to transparent
        webViewDescription.setBackgroundColor(0x00000000);

        // Use Html.fromHtml() to set the formatted HTML content for buttonText
        String formattedButtonText = "<html><body style='font-size: 18px; color: #aaa9a9;'>" + buttonText + "</body></html>";
        popupTitle.setText(Html.fromHtml(formattedButtonText, Html.FROM_HTML_MODE_LEGACY));

        // Format the description for the WebView (for rendering HTML content)
        String updatedButtonDescription = buttonDescription.replace(
                "<ul>", "<ul style='padding-left: 20px;'>"
        );

        // Load the HTML content into the description WebView
        String formattedDescriptionHtml = "<html><body style='font-size: 16px;'>" + updatedButtonDescription + "</body></html>";
        webViewDescription.loadDataWithBaseURL(null, formattedDescriptionHtml, "text/html", "UTF-8", null);

        // Set up the tag container for multiple tags
        com.google.android.flexbox.FlexboxLayout tagContainer = popupView.findViewById(R.id.tag_container);
        tagContainer.removeAllViews(); // Clear existing tags

        for (String tagText : tagTexts) {
            TextView tagTextView = new TextView(context);
            tagTextView.setText(tagText);
            tagTextView.setTextSize(14);
            tagTextView.setGravity(Gravity.CENTER);
            tagTextView.setPadding(8, 4, 8, 4);

            int tagColorKiller = TagColor.getColorForTag(tagText);

            GradientDrawable drawable = (GradientDrawable) context.getDrawable(R.drawable.rounded_tag);

            drawable.setColor(tagColorKiller);
            tagTextView.setBackground(drawable);

            if (tagColorKiller == Color.WHITE) {
                tagTextView.setTextColor(Color.BLACK);
            } else {
                tagTextView.setTextColor(Color.WHITE);
            }

            // Use FlexboxLayout.LayoutParams to add margins (vertical spacing)
            com.google.android.flexbox.FlexboxLayout.LayoutParams params = new com.google.android.flexbox.FlexboxLayout.LayoutParams(
                    com.google.android.flexbox.FlexboxLayout.LayoutParams.WRAP_CONTENT,
                    com.google.android.flexbox.FlexboxLayout.LayoutParams.WRAP_CONTENT
            );

            // Set horizontal margin
            params.setMargins(0, 0, 16, 16); // Left, Top, Right, Bottom margins

            tagTextView.setLayoutParams(params);

            tagContainer.addView(tagTextView);
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

        if (characterPortraitKiller != null)    {
            characterPortraitKiller.setAlpha(0.3f);
        }

        if (replicaIconKiller != null)    {
            replicaIconKiller.setAlpha(0.3f);
        }

        if (popupDescription != null)    {
            popupDescription.setAlpha(0.3f);
        }

        if (popupDescription2 != null)    {
            popupDescription2.setAlpha(0.3f);
        }

        if (popupTitleKiller != null)    {
            popupTitleKiller.setAlpha(0.3f);
        }

        if (closeButtonKiller != null)    {
            closeButtonKiller.setAlpha(0.3f);
        }

        if (squareContainerPerks != null)    {
            squareContainerPerks.setAlpha(0.3f);
        }

        if (textContainerShrine != null)    {
            textContainerShrine.setAlpha(0.3f);
        }

        if (containerPerksShrine != null)    {
            containerPerksShrine.setAlpha(0.3f);
        }

        if (buttonGenerate != null)    {
            buttonGenerate.setAlpha(0.3f);
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

            // Hide the characterBackgroundOverlay when the perk popup is dismissed
            if (characterBackgroundOverlay != null) {
                characterBackgroundOverlay.setVisibility(View.GONE);
            }

            if (characterPortraitKiller != null)    {
                characterPortraitKiller.setAlpha(1f);
            }

            if (replicaIconKiller != null)    {
                replicaIconKiller.setAlpha(1f);
            }

            if (popupDescription != null)    {
                popupDescription.setAlpha(1f);
            }

            if (popupDescription2 != null)    {
                popupDescription2.setAlpha(1f);
            }

            if (popupTitleKiller != null)    {
                popupTitleKiller.setAlpha(1f);
            }

            if (closeButtonKiller != null)    {
                closeButtonKiller.setAlpha(1f);
            }

            if (squareContainerPerks != null)    {
                squareContainerPerks.setAlpha(1f);
            }

            if (textContainerShrine != null)    {
                textContainerShrine.setAlpha(1f);
            }

            if (containerPerksShrine != null)    {
                containerPerksShrine.setAlpha(1f);
            }

            if (buttonGenerate != null)    {
                buttonGenerate.setAlpha(1f);
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
            List<PerkItem> filteredList = new ArrayList<>();
            for (PerkItem item : originalButtonItems) {
                if (item.getLabel().toLowerCase().contains(query.toLowerCase())) {
                    filteredList.add(item);
                } else {
                    for (String tag : item.getTags()) {
                        if (tag.toLowerCase().contains(query.toLowerCase())) {
                            filteredList.add(item);
                            break; // Break to avoid adding the same item multiple times
                        }
                    }
                }
            }
            filteredButtonItems = filteredList;
        }
        notifyDataSetChanged();
    }

    // Method to update the items dynamically, for example, after sorting
    public void updateItems(List<PerkItem> newItems) {
        this.filteredButtonItems = new ArrayList<>(newItems);
        notifyDataSetChanged(); // Notify the adapter to refresh the RecyclerView
    }

    // Method to sort the items alphabetically (A-Z)
    public void sortItems(boolean isAscending) {
        Collections.sort(filteredButtonItems, new Comparator<PerkItem>() {
            @Override
            public int compare(PerkItem item1, PerkItem item2) {
                int comparisonResult = item1.getLabel().compareToIgnoreCase(item2.getLabel());
                return isAscending ? comparisonResult : -comparisonResult; // Invert comparison for Z-A
            }
        });
        notifyDataSetChanged(); // Refresh the RecyclerView after sorting
    }

    // ViewHolder class for the rotated buttons
    public static class ButtonViewHolder extends RecyclerView.ViewHolder {
        FrameLayout buttonContainer;
        ImageView iconView; // Icon view reference

        public ButtonViewHolder(@NonNull View itemView) {
            super(itemView);
            buttonContainer = itemView.findViewById(R.id.button_item);
            iconView = itemView.findViewById(R.id.button_icon); // Initialize the ImageView
        }
    }
}
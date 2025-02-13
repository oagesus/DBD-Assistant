package com.example.dbdguide;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
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

public class ButtonAdapterCharactersSurvivor extends RecyclerView.Adapter<ButtonAdapterCharactersSurvivor.ButtonViewHolder> {

    private final List<CharacterItem> originalButtonItems;
    private List<CharacterItem> filteredButtonItems;
    private final Context context;

    // Constructor
    public ButtonAdapterCharactersSurvivor(Context context, List<CharacterItem> buttonItems) {
        this.context = context;
        this.originalButtonItems = buttonItems;
        this.filteredButtonItems = new ArrayList<>(buttonItems); // Initialize with the full list
    }

    @NonNull
    @Override
    public ButtonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the FrameLayout layout
        View view = LayoutInflater.from(context).inflate(R.layout.button_item_character_survivor, parent, false);
        return new ButtonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtonViewHolder holder, int position) {
        CharacterItem buttonItem = filteredButtonItems.get(position);

        // Set the icon for the button
        holder.iconView.setImageResource(buttonItem.getIconResId());

        // Set a click listener for the button container
        holder.buttonContainer.setOnClickListener(v -> {
            String buttonText = buttonItem.getLabel();
            String buttonDescription = buttonItem.getDescription();
            String buttonDescription2 = buttonItem.getDescription2();
            int iconResId = buttonItem.getIconResId();
            showPopupWindow(v, buttonText, buttonDescription, buttonDescription2, iconResId, buttonItem);  // Pass the tag
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

    private void showPopupWindow(View anchorView, String buttonText, String buttonDescription, String buttonDescription2, int iconResId, CharacterItem characterItem) {
        // Inflate the character popup layout
        View popupView = LayoutInflater.from(context).inflate(R.layout.character_popup_survivor, null);

        // Set up the WebViews to allow loading images
        WebView webViewDescription = popupView.findViewById(R.id.popup_description);
        WebView webViewDescription2 = popupView.findViewById(R.id.popup_description_2);
        webViewDescription.getSettings().setLoadsImagesAutomatically(true);
        webViewDescription2.getSettings().setLoadsImagesAutomatically(true);

        // Load the HTML content into the WebViews
        webViewDescription.loadDataWithBaseURL(null, buttonDescription, "text/html", "UTF-8", null);
        webViewDescription2.loadDataWithBaseURL(null, buttonDescription2, "text/html", "UTF-8", null);

        // Set the WebView background to transparent
        webViewDescription.setBackgroundColor(0x00000000);
        webViewDescription2.setBackgroundColor(0x00000000);

        // Get the screen dimensions
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenWidth = displayMetrics.widthPixels;
        int screenHeight = displayMetrics.heightPixels;

        // Create the PopupWindow with calculated dimensions
        PopupWindow popupWindow = new PopupWindow(
                popupView,
                screenWidth,
                (int) (screenHeight * 0.8)
        );

        // Set up the button replica safely
        FrameLayout buttonReplicaContainer = popupView.findViewById(R.id.button_replica_container);
        if (buttonReplicaContainer != null) {
            ImageView replicaIcon = buttonReplicaContainer.findViewById(R.id.replica_icon_killer);
            if (replicaIcon != null) {
                replicaIcon.setImageResource(iconResId);
            } else {
                Log.e("ButtonAdapterCharacters", "replica_icon not found in button_replica_container");
            }
        } else {
            Log.e("ButtonAdapterCharacters", "button_replica_container not found in the inflated layout");
        }

        // Set up the popup title and style the HTML
        TextView popupTitleKiller = popupView.findViewById(R.id.popup_title_killer);
        String formattedButtonText = "<html><body style='font-size: 18px; color: #aaa9a9;'>" + buttonText + "</body></html>";
        popupTitleKiller.setText(Html.fromHtml(formattedButtonText, Html.FROM_HTML_MODE_LEGACY));

        // Format the first description and load into WebView
        String updatedButtonDescription = buttonDescription.replace("<ul>", "<ul style='padding-left: 20px;'>");
        String formattedDescriptionHtml = "<html><body style='font-size: 16px;'>" + updatedButtonDescription + "</body></html>";
        webViewDescription.loadDataWithBaseURL(null, formattedDescriptionHtml, "text/html", "UTF-8", null);

        // Format the second description and load into second WebView
        String updatedButtonDescription2 = buttonDescription2.replace("<ul>", "<ul style='padding-left: 20px;'>");
        String formattedDescriptionHtml2 = "<html><body style='font-size: 16px;'>" + updatedButtonDescription2 + "</body></html>";
        webViewDescription2.loadDataWithBaseURL(null, formattedDescriptionHtml2, "text/html", "UTF-8", null);

        // Set up the close button for the character popup
        View closeButtonKiller = popupView.findViewById(R.id.close_popup_killer);
        closeButtonKiller.setOnClickListener(v -> popupWindow.dismiss());

        // Set dismiss and outside-touch logic
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);

        // Dim specific background views (SearchView, spinner, searchbar)
        SearchView searchView = ((Activity) context).findViewById(R.id.search_view_character);
        Spinner spinner = ((Activity) context).findViewById(R.id.spinner_character);
        LinearLayout searchbar = ((Activity) context).findViewById(R.id.searchbar_character);

        if (searchView != null) {
            searchView.setAlpha(0.3f);
        }
        if (searchbar != null) {
            searchbar.setBackgroundColor(Color.parseColor("#80000000"));
        }
        if (spinner != null) {
            spinner.setAlpha(0.3f);
        }

        // Dim the background overlay
        View backgroundOverlay = ((Activity) context).findViewById(R.id.background_overlay_character);
        if (backgroundOverlay != null) {
            backgroundOverlay.setVisibility(View.VISIBLE);
        }

        // Restore view states when popup is dismissed
        popupWindow.setOnDismissListener(() -> {
            if (backgroundOverlay != null) {
                backgroundOverlay.setVisibility(View.GONE);
            }
            if (searchView != null) {
                searchView.setAlpha(1f);
            }
            if (searchbar != null) {
                searchbar.setBackgroundColor(Color.parseColor("#282828"));
            }
            if (spinner != null) {
                spinner.setAlpha(1f);
            }
        });

        // Retrieve the CharacterItem from the passed parameter
        CharacterItem buttonItem = characterItem;
        List<Integer> perkIcons = buttonItem.getPerks(); // List of perk drawable resource IDs

        // Set the perk icons to the corresponding ImageViews and add click listeners
        if (perkIcons != null && perkIcons.size() >= 3) {
            ImageView perkIcon1 = popupView.findViewById(R.id.perk_icon_1);
            ImageView perkIcon2 = popupView.findViewById(R.id.perk_icon_2);
            ImageView perkIcon3 = popupView.findViewById(R.id.perk_icon_3);

            // Set the images from the perk drawable resource IDs (with null checks)
            if (perkIcon1 != null) {
                perkIcon1.setImageResource(perkIcons.get(0));
            } else {
                Log.e("ButtonAdapterCharacters", "perk_icon_1 not found");
            }
            if (perkIcon2 != null) {
                perkIcon2.setImageResource(perkIcons.get(1));
            } else {
                Log.e("ButtonAdapterCharacters", "perk_icon_2 not found");
            }
            if (perkIcon3 != null) {
                perkIcon3.setImageResource(perkIcons.get(2));
            } else {
                Log.e("ButtonAdapterCharacters", "perk_icon_3 not found");
            }

            // Get the list of all killer perk items
            List<PerkItem> killerPerks = PerkSurvivorItemData.getButtonItems();

            // Determine a valid anchor view for the perk popup.
            // Instead of using the clicked view (which might be part of the current popup),
            // we use the activity's root view.
            View rootView = ((Activity) context).findViewById(android.R.id.content);

            // For each perk icon, add a click listener that looks up the corresponding perk data
            if (perkIcon1 != null) {
                perkIcon1.setOnClickListener(v -> {
                    // Set the character_background_overlay to visible
                    View characterBackgroundOverlay = popupView.findViewById(R.id.background_overlay_character);
                    if (characterBackgroundOverlay != null) {
                        characterBackgroundOverlay.setVisibility(View.VISIBLE);
                    }

                    ImageView characterPortraitKiller = popupView.findViewById(R.id.character_portrait_killer);
                    if (characterPortraitKiller != null)    {
                        characterPortraitKiller.setAlpha(0.3f);
                    }

                    ImageView replicaIconKiller = popupView.findViewById(R.id.replica_icon_killer);
                    if (replicaIconKiller != null)    {
                        replicaIconKiller.setAlpha(0.3f);
                    }

                    WebView popupDescription = popupView.findViewById(R.id.popup_description);
                    if (popupDescription != null)    {
                        popupDescription.setAlpha(0.3f);
                    }

                    WebView popupDescription2 = popupView.findViewById(R.id.popup_description_2);
                    if (popupDescription2 != null)    {
                        popupDescription2.setAlpha(0.3f);
                    }

                    if (popupTitleKiller != null)    {
                        popupTitleKiller.setAlpha(0.3f);
                    }

                    if (closeButtonKiller != null)    {
                        closeButtonKiller.setAlpha(0.3f);
                    }

                    FrameLayout squareContainerPerks = popupView.findViewById(R.id.square_container_perks);
                    if (squareContainerPerks != null)    {
                        squareContainerPerks.setAlpha(0.3f);
                    }

                    ConstraintLayout textContainerShrine = popupView.findViewById(R.id.text_container_shrine);
                    if (textContainerShrine != null)    {
                        textContainerShrine.setAlpha(0.3f);
                    }

                    ConstraintLayout containerPerksShrine = popupView.findViewById(R.id.container_perks_shrine);
                    if (containerPerksShrine != null)    {
                        containerPerksShrine.setAlpha(0.3f);
                    }

                    Button buttonGenerate = popupView.findViewById(R.id.button_generate);
                    if (buttonGenerate != null)    {
                        buttonGenerate.setAlpha(0.3f);
                    }

                    int perkResId = perkIcons.get(0);
                    for (PerkItem perk : killerPerks) {
                        if (perk.getIconResId() == perkResId) {
                            ButtonAdapterPerks perkAdapter = new ButtonAdapterPerks(context, killerPerks);
                            perkAdapter.showPopupWindow(rootView, perk.getLabel(), perk.getDescription(), perk.getIconResId(), perk.getTags(), characterBackgroundOverlay, characterPortraitKiller, replicaIconKiller, popupDescription, popupDescription2, popupTitleKiller, closeButtonKiller, squareContainerPerks, textContainerShrine, containerPerksShrine, buttonGenerate);
                            break;
                        }
                    }
                });
            }

            if (perkIcon2 != null) {
                perkIcon2.setOnClickListener(v -> {
                    // Set the character_background_overlay to visible
                    View characterBackgroundOverlay = popupView.findViewById(R.id.background_overlay_character);
                    if (characterBackgroundOverlay != null) {
                        characterBackgroundOverlay.setVisibility(View.VISIBLE);
                    }

                    ImageView characterPortraitKiller = popupView.findViewById(R.id.character_portrait_killer);
                    if (characterPortraitKiller != null)    {
                        characterPortraitKiller.setAlpha(0.3f);
                    }

                    ImageView replicaIconKiller = popupView.findViewById(R.id.replica_icon_killer);
                    if (replicaIconKiller != null)    {
                        replicaIconKiller.setAlpha(0.3f);
                    }

                    WebView popupDescription = popupView.findViewById(R.id.popup_description);
                    if (popupDescription != null)    {
                        popupDescription.setAlpha(0.3f);
                    }

                    WebView popupDescription2 = popupView.findViewById(R.id.popup_description_2);
                    if (popupDescription2 != null)    {
                        popupDescription2.setAlpha(0.3f);
                    }

                    if (popupTitleKiller != null)    {
                        popupTitleKiller.setAlpha(0.3f);
                    }

                    if (closeButtonKiller != null)    {
                        closeButtonKiller.setAlpha(0.3f);
                    }

                    FrameLayout squareContainerPerks = popupView.findViewById(R.id.square_container_perks);
                    if (squareContainerPerks != null)    {
                        squareContainerPerks.setAlpha(0.3f);
                    }

                    ConstraintLayout textContainerShrine = popupView.findViewById(R.id.text_container_shrine);
                    if (textContainerShrine != null)    {
                        textContainerShrine.setAlpha(0.3f);
                    }

                    ConstraintLayout containerPerksShrine = popupView.findViewById(R.id.container_perks_shrine);
                    if (containerPerksShrine != null)    {
                        containerPerksShrine.setAlpha(0.3f);
                    }

                    Button buttonGenerate = popupView.findViewById(R.id.button_generate);
                    if (buttonGenerate != null)    {
                        buttonGenerate.setAlpha(0.3f);
                    }

                    int perkResId = perkIcons.get(1);
                    for (PerkItem perk : killerPerks) {
                        if (perk.getIconResId() == perkResId) {
                            ButtonAdapterPerks perkAdapter = new ButtonAdapterPerks(context, killerPerks);
                            perkAdapter.showPopupWindow(rootView, perk.getLabel(), perk.getDescription(), perk.getIconResId(), perk.getTags(), characterBackgroundOverlay, characterPortraitKiller, replicaIconKiller, popupDescription, popupDescription2, popupTitleKiller, closeButtonKiller, squareContainerPerks, textContainerShrine, containerPerksShrine, buttonGenerate);
                            break;
                        }
                    }
                });
            }

            if (perkIcon3 != null) {
                perkIcon3.setOnClickListener(v -> {
                    // Set the character_background_overlay to visible
                    View characterBackgroundOverlay = popupView.findViewById(R.id.background_overlay_character);
                    if (characterBackgroundOverlay != null) {
                        characterBackgroundOverlay.setVisibility(View.VISIBLE);
                    }

                    ImageView characterPortraitKiller = popupView.findViewById(R.id.character_portrait_killer);
                    if (characterPortraitKiller != null)    {
                        characterPortraitKiller.setAlpha(0.3f);
                    }

                    ImageView replicaIconKiller = popupView.findViewById(R.id.replica_icon_killer);
                    if (replicaIconKiller != null)    {
                        replicaIconKiller.setAlpha(0.3f);
                    }

                    WebView popupDescription = popupView.findViewById(R.id.popup_description);
                    if (popupDescription != null)    {
                        popupDescription.setAlpha(0.3f);
                    }

                    WebView popupDescription2 = popupView.findViewById(R.id.popup_description_2);
                    if (popupDescription2 != null)    {
                        popupDescription2.setAlpha(0.3f);
                    }

                    if (popupTitleKiller != null)    {
                        popupTitleKiller.setAlpha(0.3f);
                    }

                    if (closeButtonKiller != null)    {
                        closeButtonKiller.setAlpha(0.3f);
                    }

                    FrameLayout squareContainerPerks = popupView.findViewById(R.id.square_container_perks);
                    if (squareContainerPerks != null)    {
                        squareContainerPerks.setAlpha(0.3f);
                    }

                    ConstraintLayout textContainerShrine = popupView.findViewById(R.id.text_container_shrine);
                    if (textContainerShrine != null)    {
                        textContainerShrine.setAlpha(0.3f);
                    }

                    ConstraintLayout containerPerksShrine = popupView.findViewById(R.id.container_perks_shrine);
                    if (containerPerksShrine != null)    {
                        containerPerksShrine.setAlpha(0.3f);
                    }

                    Button buttonGenerate = popupView.findViewById(R.id.button_generate);
                    if (buttonGenerate != null)    {
                        buttonGenerate.setAlpha(0.3f);
                    }

                    int perkResId = perkIcons.get(2);
                    for (PerkItem perk : killerPerks) {
                        if (perk.getIconResId() == perkResId) {
                            ButtonAdapterPerks perkAdapter = new ButtonAdapterPerks(context, killerPerks);
                            perkAdapter.showPopupWindow(rootView, perk.getLabel(), perk.getDescription(), perk.getIconResId(), perk.getTags(), characterBackgroundOverlay, characterPortraitKiller, replicaIconKiller, popupDescription, popupDescription2, popupTitleKiller, closeButtonKiller, squareContainerPerks, textContainerShrine, containerPerksShrine, buttonGenerate);
                            break;
                        }
                    }
                });
            }
        }

        // Finally, show the character popup window centered on the screen
        popupWindow.showAtLocation(anchorView, Gravity.CENTER, 0, 0);
    }


    // Method to update the items dynamically, for example, after sorting
    public void updateItems(List<CharacterItem> newItems) {
        this.filteredButtonItems = new ArrayList<>(newItems);
        notifyDataSetChanged(); // Notify the adapter to refresh the RecyclerView
    }

    // Method to sort the items alphabetically (A-Z)
    public void sortItems(boolean isAscending) {
        Collections.sort(filteredButtonItems, new Comparator<CharacterItem>() {
            @Override
            public int compare(CharacterItem item1, CharacterItem item2) {
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
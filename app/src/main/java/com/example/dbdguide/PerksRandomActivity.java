package com.example.dbdguide;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class PerksRandomActivity extends AppCompatActivity {

    private ImageView shrinePerkIcon1, shrinePerkIcon2, shrinePerkIcon3, shrinePerkIcon4;
    private List<PerkItem> selectedPerks;    // The 4 randomly selected perk items
    private Spinner spinner; // Declare Spinner as a class variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perks_random);

        // --- Spinner Setup ---
        spinner = findViewById(R.id.spinner); // Initialize Spinner
        // (Adjust spinner LayoutParams if needed)
        ConstraintLayout.LayoutParams spinnerLayoutParams = (ConstraintLayout.LayoutParams) spinner.getLayoutParams();
        spinner.setLayoutParams(spinnerLayoutParams);

        // Create spinner items programmatically from array resource
        String[] spinnerItemsArray = getResources().getStringArray(R.array.spinner_items_random);
        List<String> spinnerItems = Arrays.asList(spinnerItemsArray);

        // Set up the custom spinner adapter (default layout for selected item)
        CustomSpinnerAdapter customSpinnerAdapter = new CustomSpinnerAdapter(
                this,
                R.layout.spinner_selected_item,   // Default layout for the selected item
                R.layout.spinner_dropdown_item,     // Layout for dropdown items
                spinnerItems
        );
        spinner.setAdapter(customSpinnerAdapter);

        // Add OnItemSelectedListener to the Spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected item
                String selectedItem = parent.getItemAtPosition(position).toString();

                // Change the Spinner's background based on the selected item
                if (selectedItem.equalsIgnoreCase("Killer")) {
                    spinner.setBackgroundResource(R.drawable.outline_killer); // Set Killer background
                } else if (selectedItem.equalsIgnoreCase("Survivor")) {
                    spinner.setBackgroundResource(R.drawable.outline_survivor); // Set Survivor background
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });
        // --- End Spinner Setup ---

        // --- Initialize Perk Icons ---
        shrinePerkIcon1 = findViewById(R.id.shrine_perk_icon_1);
        shrinePerkIcon2 = findViewById(R.id.shrine_perk_icon_2);
        shrinePerkIcon3 = findViewById(R.id.shrine_perk_icon_3);
        shrinePerkIcon4 = findViewById(R.id.shrine_perk_icon_4);

        // Initially, set all icons to the placeholder image.
        shrinePerkIcon1.setImageResource(R.drawable.icon_placeholder);
        shrinePerkIcon2.setImageResource(R.drawable.icon_placeholder);
        shrinePerkIcon3.setImageResource(R.drawable.icon_placeholder);
        shrinePerkIcon4.setImageResource(R.drawable.icon_placeholder);
        // --- End Initialize Perk Icons ---

        // --- Setup "Generate" Button ---
        Button buttonGenerate = findViewById(R.id.button_generate);

        buttonGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Determine which type of perks to generate based on the spinner selection.
                String selection = spinner.getSelectedItem().toString();
                List<PerkItem> perks;
                if (selection.equalsIgnoreCase("Killer")) {
                    perks = PerkKillerItemData.getButtonItems();
                } else if (selection.equalsIgnoreCase("Survivor")) {
                    perks = PerkSurvivorItemData.getButtonItems();
                } else {
                    // Fallback (or you might want to show a message)
                    perks = new ArrayList<>();
                }
                // Shuffle the list and select up to 4 perks.
                Collections.shuffle(perks);
                selectedPerks = perks.subList(0, Math.min(4, perks.size()));

                // Update the icons to display the newly selected perks.
                setDrawableResources();
                setClickListeners();
            }
        });
        // --- End "Generate" Button Setup ---
    }

    /**
     * Sets the image resource for each perk icon based on the selected perks.
     */
    private void setDrawableResources() {
        if (selectedPerks != null && selectedPerks.size() >= 4) {
            shrinePerkIcon1.setImageResource(selectedPerks.get(0).getIconResId());
            shrinePerkIcon2.setImageResource(selectedPerks.get(1).getIconResId());
            shrinePerkIcon3.setImageResource(selectedPerks.get(2).getIconResId());
            shrinePerkIcon4.setImageResource(selectedPerks.get(3).getIconResId());
        } else {
            // Fallback: set placeholder icons if something went wrong
            shrinePerkIcon1.setImageResource(R.drawable.icon_placeholder);
            shrinePerkIcon2.setImageResource(R.drawable.icon_placeholder);
            shrinePerkIcon3.setImageResource(R.drawable.icon_placeholder);
            shrinePerkIcon4.setImageResource(R.drawable.icon_placeholder);
        }
    }

    /**
     * Sets click listeners for each perk icon that show a popup with perk details.
     */
    private void setClickListeners() {
        if (selectedPerks != null && selectedPerks.size() >= 4) {
            shrinePerkIcon1.setOnClickListener(v -> showPopupForPerk(selectedPerks.get(0).getIconResId()));
            shrinePerkIcon2.setOnClickListener(v -> showPopupForPerk(selectedPerks.get(1).getIconResId()));
            shrinePerkIcon3.setOnClickListener(v -> showPopupForPerk(selectedPerks.get(2).getIconResId()));
            shrinePerkIcon4.setOnClickListener(v -> showPopupForPerk(selectedPerks.get(3).getIconResId()));
        }
    }

    /**
     * Displays a popup for the perk corresponding to the given drawable resource ID.
     */
    private void showPopupForPerk(int drawableResId) {
        PerkItem perkItem = findPerkItemByDrawableResId(drawableResId);
        if (perkItem != null) {
            ButtonAdapterPerks buttonAdapterPerks = new ButtonAdapterPerks(this, getAllPerkItems());
            buttonAdapterPerks.showPopupWindow(
                    findViewById(android.R.id.content),
                    perkItem.getLabel(),
                    perkItem.getDescription(),
                    perkItem.getIconResId(),
                    perkItem.getTags(),
                    findViewById(R.id.background_overlay_character),
                    findViewById(R.id.character_portrait_killer),
                    findViewById(R.id.replica_icon_killer),
                    findViewById(R.id.popup_description),
                    findViewById(R.id.popup_description_2),
                    findViewById(R.id.popup_title_killer),
                    findViewById(R.id.close_popup_killer),
                    findViewById(R.id.square_container_perks),
                    findViewById(R.id.text_container_shrine),
                    findViewById(R.id.container_perks_shrine),
                    findViewById(R.id.button_generate)
            );
        }
    }

    /**
     * Finds and returns a PerkItem from the combined data set that matches the given drawable resource ID.
     */
    private PerkItem findPerkItemByDrawableResId(int drawableResId) {
        List<PerkItem> allPerkItems = getAllPerkItems();
        for (PerkItem item : allPerkItems) {
            if (item.getIconResId() == drawableResId) {
                return item;
            }
        }
        return null;
    }

    /**
     * Returns a combined list of all perk items.
     */
    private List<PerkItem> getAllPerkItems() {
        List<PerkItem> allPerkItems = new ArrayList<>(PerkKillerItemData.getButtonItems());
        allPerkItems.addAll(PerkSurvivorItemData.getButtonItems());
        return allPerkItems;
    }
}
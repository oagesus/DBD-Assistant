package com.example.dbdguide;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
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
    // Declare the TextViews for displaying perk labels
    private TextView textGenerate;
    private TextView textGenerate2;

    // Handler and Runnable for waiting animation
    private Handler waitingHandler;
    private Runnable waitingRunnable;
    private int waitingCycle = 0;
    private final String[] waitingMessages = {
            "Waiting for Perks to be <font color=\"#8BD379\">generated</font>",
            "Waiting for Perks to be <font color=\"#8BD379\">generated</font>.",
            "Waiting for Perks to be <font color=\"#8BD379\">generated</font>..",
            "Waiting for Perks to be <font color=\"#8BD379\">generated</font>..."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perks_random);

        // --- Spinner Setup ---
        spinner = findViewById(R.id.spinner); // Initialize Spinner
        ConstraintLayout.LayoutParams spinnerLayoutParams = (ConstraintLayout.LayoutParams) spinner.getLayoutParams();
        spinner.setLayoutParams(spinnerLayoutParams);

        String[] spinnerItemsArray = getResources().getStringArray(R.array.spinner_items_random);
        List<String> spinnerItems = Arrays.asList(spinnerItemsArray);

        CustomSpinnerAdapter customSpinnerAdapter = new CustomSpinnerAdapter(
                this,
                R.layout.spinner_selected_item,
                R.layout.spinner_dropdown_item,
                spinnerItems
        );
        spinner.setAdapter(customSpinnerAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (selectedItem.equalsIgnoreCase("Killer")) {
                    spinner.setBackgroundResource(R.drawable.outline_killer);
                } else if (selectedItem.equalsIgnoreCase("Survivor")) {
                    spinner.setBackgroundResource(R.drawable.outline_survivor);
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

        shrinePerkIcon1.setImageResource(R.drawable.icon_placeholder);
        shrinePerkIcon2.setImageResource(R.drawable.icon_placeholder);
        shrinePerkIcon3.setImageResource(R.drawable.icon_placeholder);
        shrinePerkIcon4.setImageResource(R.drawable.icon_placeholder);
        // --- End Initialize Perk Icons ---

        // --- Initialize TextViews for Perk Labels ---
        textGenerate = findViewById(R.id.text_generate);
        textGenerate2 = findViewById(R.id.text_generate2);
        // Initially, only textGenerate shows waiting messages while textGenerate2 stays empty.
        textGenerate2.setText("");
        // --- End Initialize TextViews ---

        // --- Start Waiting Animation for textGenerate ---
        waitingHandler = new Handler();
        waitingRunnable = new Runnable() {
            @Override
            public void run() {
                textGenerate.setText(android.text.Html.fromHtml(waitingMessages[waitingCycle % waitingMessages.length]));
                waitingCycle++;
                waitingHandler.postDelayed(this, 300);
            }
        };
        waitingHandler.post(waitingRunnable);
        // --- End Waiting Animation Setup ---

        // --- Setup "Generate" Button ---
        Button buttonGenerate = findViewById(R.id.button_generate);

        buttonGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Cancel the waiting animation immediately.
                waitingHandler.removeCallbacks(waitingRunnable);

                // Determine which type of perks to generate based on the spinner selection.
                String selection = spinner.getSelectedItem().toString();
                List<PerkItem> perks;
                if (selection.equalsIgnoreCase("Killer")) {
                    perks = PerkKillerItemData.getButtonItems();
                } else if (selection.equalsIgnoreCase("Survivor")) {
                    perks = PerkSurvivorItemData.getButtonItems();
                } else {
                    perks = new ArrayList<>();
                }
                Collections.shuffle(perks);
                selectedPerks = perks.subList(0, Math.min(4, perks.size()));

                // Update the icons to display the newly selected perks.
                setDrawableResources();
                setClickListeners();

                if (selectedPerks != null && selectedPerks.size() >= 4) {
                    String label1 = extractLabel(selectedPerks.get(0).getLabel());
                    String label2 = extractLabel(selectedPerks.get(1).getLabel());
                    String label3 = extractLabel(selectedPerks.get(2).getLabel());
                    String label4 = extractLabel(selectedPerks.get(3).getLabel());

                    // Set text color based on spinner selection.
                    int textColor;
                    if (selection.equalsIgnoreCase("Killer")) {
                        textColor = getResources().getColor(R.color.red_killer_text);
                    } else if (selection.equalsIgnoreCase("Survivor")) {
                        textColor = getResources().getColor(R.color.blue_survivor_text);
                    } else {
                        textColor = getResources().getColor(android.R.color.black);
                    }
                    // Convert the color int to hex (ignoring alpha)
                    String labelColorHex = String.format("#%06X", (0xFFFFFF & textColor));

                    // Build HTML strings so that the labels appear in the chosen color and the slash in white.
                    String htmlText1 = "<font color=\"" + labelColorHex + "\">" + label1 + "</font>" +
                            "<font color=\"#ffffff\"> / </font>" +
                            "<font color=\"" + labelColorHex + "\">" + label2 + "</font>";
                    String htmlText2 = "<font color=\"" + labelColorHex + "\">" + label3 + "</font>" +
                            "<font color=\"#ffffff\"> / </font>" +
                            "<font color=\"" + labelColorHex + "\">" + label4 + "</font>";

                    // Immediately update the TextViews with generated perk labels.
                    textGenerate.setText(android.text.Html.fromHtml(htmlText1));
                    textGenerate2.setText(android.text.Html.fromHtml(htmlText2));
                } else {
                    textGenerate.setText("Not enough perks");
                    textGenerate2.setText("");
                }
            }
        });
        // --- End "Generate" Button Setup ---
    }

    /**
     * Helper method to extract the text between <b> and </b> from an HTML label string.
     * If "</b>" is not found, it falls back to searching for "</font>".
     * The extracted text is converted to lowercase and then capitalized (first letter of each word).
     */
    private String extractLabel(String htmlLabel) {
        int start = htmlLabel.indexOf("<b>");
        int end = htmlLabel.indexOf("</b>");

        if (end == -1) {
            end = htmlLabel.indexOf("</font>");
        }

        if (start != -1 && end != -1 && end > start) {
            String extracted = htmlLabel.substring(start + 3, end).toLowerCase();
            StringBuilder result = new StringBuilder();
            boolean capitalizeNext = true; // Capitalize first letter and letters after "-" and " "

            for (char c : extracted.toCharArray()) {
                if (capitalizeNext && Character.isLetter(c)) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(c);
                }
                if (c == ' ' || c == '-') { // Reset flag after space or "-"
                    capitalizeNext = true;
                }
            }

            return result.toString().trim();
        }

        return htmlLabel;
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
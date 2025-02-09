package com.example.dbdguide;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.appcompat.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MapsActivity extends AppCompatActivity {

    private ButtonAdapterMaps buttonAdapterMaps; // Declare the adapter for buttons
    private List<MapItem> buttonItems; // Declare the list of button items
    private String currentSearchQuery = ""; // Store the current search query
    private int currentSpinnerSelection = 0; // Store the current spinner selection

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Reference to SearchView
        SearchView searchView = findViewById(R.id.search_view);
        EditText searchEditText = searchView.findViewById(androidx.appcompat.R.id.search_src_text);

        int screenWidth = getScreenWidth(); // Get screen width in pixels

        // Calculate size to set both width and height to 10% of screen width
        int spinnerSize = (int) (screenWidth * 0.1);  // Set size to 10% of screen width

        // Adjust SearchView width
        int searchWidth = (int) (screenWidth * 0.8);  // Set to 80% of screen width
        LinearLayout.LayoutParams searchViewLayoutParams = (LinearLayout.LayoutParams) searchView.getLayoutParams();
        searchViewLayoutParams.width = searchWidth;  // Apply custom width
        searchView.setLayoutParams(searchViewLayoutParams);

        // Set the query hint programmatically to "Search maps..."
        searchView.setQueryHint("Search maps...");
        searchEditText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);  // Set custom font size

        // Optional: Set other properties if necessary
        searchView.setIconifiedByDefault(false); // Keep the search bar expanded
        searchViewLayoutParams.height = spinnerSize;  // Set height to match spinner's height (square)
        searchView.setLayoutParams(searchViewLayoutParams);

        // Reference to RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        // Set GridLayoutManager with 2 columns (instead of 3)
        int spanCount = 2; // Number of columns (changed from 3 to 2)
        GridLayoutManager layoutManager = new GridLayoutManager(this, spanCount);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setNestedScrollingEnabled(true);

        // Calculate dynamic spacing for 2 items per row
        int itemWidth = getResources().getDimensionPixelSize(R.dimen.grid_item_width_maps); // Button width
        int totalSpacing = screenWidth - (itemWidth * spanCount); // Calculate total spacing
        int spacing = totalSpacing / (spanCount + 1); // Equal spacing on all sides

        // Ensure spacing doesn't go negative
        if (spacing < 0) {
            spacing = 0; // Set spacing to 0 if calculated as negative
        }

        // Add dynamic spacing between grid items
        recyclerView.addItemDecoration(new GridSpacingItemMaps(spacing, true));

        // Get the list of ButtonItems from the ButtonItemData class
        buttonItems = MapItemData.getButtonItems();

        // Initialize the adapter and set it to the RecyclerView
        buttonAdapterMaps = new ButtonAdapterMaps(this, buttonItems);
        recyclerView.setAdapter(buttonAdapterMaps);

        // Set up the SearchView listener
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                currentSearchQuery = newText;  // Update the current search query
                applyFilters();  // Apply filters and sorting together
                return true;
            }
        });

        // Set Spinner width and height dynamically
        Spinner spinner = findViewById(R.id.spinner);

        // List of spinner items
        List<String> spinnerItems = Arrays.asList("A-Z", "Z-A", "Old-New", "New-Old");

        // Set up the custom spinner adapter
        CustomSpinnerAdapter customSpinnerAdapter = new CustomSpinnerAdapter(
                this,
                R.layout.spinner_selected_item,  // Layout for the selected item
                R.layout.spinner_dropdown_item, // Layout for dropdown items with red background
                spinnerItems
        );

        spinner.setAdapter(customSpinnerAdapter);

        // Adjust spinner layout parameters
        LinearLayout.LayoutParams spinnerLayoutParams = (LinearLayout.LayoutParams) spinner.getLayoutParams();
        int spinnerSizeV2 = (int) (screenWidth * 0.2);
        spinnerLayoutParams.width = spinnerSizeV2;  // Set width
        spinnerLayoutParams.height = spinnerSize;  // Set height
        spinner.setLayoutParams(spinnerLayoutParams);

        // Set the listener for spinner selection
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                currentSpinnerSelection = position;  // Update the current spinner selection
                applyFilters();  // Apply filters and sorting together
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // No action needed when nothing is selected
            }
        });
    }

    // Helper to get screen width
    private int getScreenWidth() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    // Method to apply both search filter, tag filter, and sorting based on the spinner selection
    private void applyFilters() {
        List<MapItem> filteredItems = new ArrayList<>();

        // Filter the items based on the current search query (search both labels and map names)
        for (MapItem item : buttonItems) {
            boolean matchesSearchQuery = item.getLabel().toLowerCase().contains(currentSearchQuery.toLowerCase()) ||
                    item.getMapName().toLowerCase().contains(currentSearchQuery.toLowerCase());

            // If either the label or the map name match the search query, include the item
            if (matchesSearchQuery) {
                filteredItems.add(item);
            }
        }

        // Sort the filtered items based on the current spinner selection
        if (currentSpinnerSelection == 0) {
            // Sort items alphabetically (A-Z)
            Collections.sort(filteredItems, (item1, item2) -> item1.getLabel().compareToIgnoreCase(item2.getLabel()));
        } else if (currentSpinnerSelection == 1) {
            // Sort items in reverse alphabetical order (Z-A)
            Collections.sort(filteredItems, (item1, item2) -> item2.getLabel().compareToIgnoreCase(item1.getLabel()));
        } else if (currentSpinnerSelection == 2) { // Sort by release number (Oldest-Newest)
            Collections.sort(filteredItems, (item1, item2) -> Integer.compare(item1.getReleaseNumber(), item2.getReleaseNumber()));
        } else if (currentSpinnerSelection == 3) { // Sort by release number (Newest-Oldest)
            Collections.sort(filteredItems, (item1, item2) -> Integer.compare(item2.getReleaseNumber(), item1.getReleaseNumber()));
        }

        // Update the adapter with the filtered and sorted list
        buttonAdapterMaps.updateItems(filteredItems);
    }
}
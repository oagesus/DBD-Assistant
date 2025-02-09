package com.example.dbdguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomSpinnerAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final List<String> items;
    private final int selectedLayoutResource; // Layout for selected item
    private final int dropdownLayoutResource; // Layout for dropdown items

    public CustomSpinnerAdapter(@NonNull Context context, int selectedLayoutResource, int dropdownLayoutResource, @NonNull List<String> items) {
        super(context, selectedLayoutResource, items);
        this.context = context;
        this.items = items;
        this.selectedLayoutResource = selectedLayoutResource;
        this.dropdownLayoutResource = dropdownLayoutResource;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // This defines how the selected item in the spinner is displayed
        View view = LayoutInflater.from(context).inflate(selectedLayoutResource, parent, false);
        TextView textView = view.findViewById(R.id.spinner_selected_text);

        // Set custom name for the selected item "Old-New"
        if (position == 2) { // "Oldest-Newest" is selected (index 2)
            textView.setText("Old");
        } else if (position == 3) { // "New-Old" is selected (index 3)
            textView.setText("New");
        } else {
            textView.setText(items.get(position));
        }
        return view;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Inflate the custom layout for the spinner dropdown item
        View view = LayoutInflater.from(context).inflate(dropdownLayoutResource, parent, false);
        TextView textView = view.findViewById(R.id.spinner_dropdown_text);
        textView.setText(items.get(position));

        // Find the divider view by ID
        View divider = view.findViewById(R.id.spinner_dropdown_divider);

        // Check if the current position is the last item in the list
        if (position == items.size() - 1) {
            // If it's the last item, hide the divider
            divider.setVisibility(View.GONE);
        } else {
            // If it's not the last item, show the divider
            divider.setVisibility(View.VISIBLE);
        }

        return view;
    }
}
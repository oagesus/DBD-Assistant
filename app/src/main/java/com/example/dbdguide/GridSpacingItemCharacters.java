package com.example.dbdguide;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class GridSpacingItemCharacters extends RecyclerView.ItemDecoration {

    private final int spanCount;
    private final int spacing;
    private final boolean includeEdge;

    public GridSpacingItemCharacters(int spanCount, int spacing, boolean includeEdge) {
        this.spanCount = spanCount;
        this.spacing = spacing;
        this.includeEdge = includeEdge;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view); // item position
        int column = position % spanCount; // item column

        if (includeEdge) {
            // Spacing on the left and right
            outRect.left = spacing - column * spacing / spanCount; // Left spacing
            outRect.right = (column + 1) * spacing / spanCount;   // Right spacing

            // Spacing on the top and bottom
            if (position < spanCount) { // Top edge for the first row
                outRect.top = spacing;
            }
            outRect.bottom = spacing; // Bottom edge
        } else {
            // Spacing on the left and right
            outRect.left = column * spacing / spanCount;          // Left spacing
            outRect.right = spacing - (column + 1) * spacing / spanCount; // Right spacing

            // Spacing on the top for rows other than the first row
            if (position >= spanCount) {
                outRect.top = spacing;
            }
        }
    }
}
package com.example.dbdguide;

import java.util.List;

public class PerkItem {
    private final String label;
    private final String description;
    private final int iconResId;
    private final List<String> tags;
    private final int releaseNumber;

    public PerkItem(String label, String description, int iconResId, List<String> tags, int releaseNumber) {
        this.label = label;
        this.description = description;
        this.iconResId = iconResId;
        this.tags = tags;
        this.releaseNumber = releaseNumber;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public int getIconResId() {
        return iconResId;
    }

    public List<String> getTags() {
        return tags;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }
}
package com.example.dbdguide;

import java.util.List;

public class CharacterItem {
    private final String label;
    private final String description;
    private final String description2;
    private final int iconResId;
    private final int releaseNumber;
    private final List<Integer> perks;

    public CharacterItem(String label, String description, String description2, int iconResId, int releaseNumber, List<Integer> perks) {
        this.label = label;
        this.description = description;
        this.description2 = description2;
        this.iconResId = iconResId;
        this.releaseNumber = releaseNumber;
        this.perks = perks;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public String getDescription2() {
        return description2;
    }

    public int getIconResId() {
        return iconResId;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public List<Integer> getPerks() {
        return perks;
    }
}
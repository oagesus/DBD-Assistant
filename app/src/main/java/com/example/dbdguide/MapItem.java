package com.example.dbdguide;

import java.util.List;

public class MapItem {
    private final String label;
    private final int mapResId;
    private final int mapPreviewResId;
    private final int releaseNumber;
    private final String mapName;

    public MapItem(String label, int mapResId, int mapPreviewResId, int releaseNumber, String mapName) {
        this.label = label;
        this.mapResId = mapResId;
        this.mapPreviewResId = mapPreviewResId;
        this.releaseNumber = releaseNumber;
        this.mapName = mapName;
    }

    public String getLabel() {
        return label;
    }

    public int getMapResId() {
        return mapResId;
    }

    public int getMapPreviewResId() {
        return mapPreviewResId;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public String getMapName() {
        return mapName;
    }
}
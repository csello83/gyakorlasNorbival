package com.varaymusic.gyakorlasNorbival.domain;

public enum Hobby {

    READING("Reading"),
    SWIMMING("Swimming"),
    MAKING_MUSIC("Making music");

    private String displayName;

    Hobby(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

package com.au.data2ml.uaa.domain.enumeration;

/**
 * The SeatingType enumeration.
 */
public enum SeatingType {
    EXTERNAL("External"),
    INTERNAL("Internal");

    private final String value;


    SeatingType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

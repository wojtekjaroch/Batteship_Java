package com.codecool;

enum SquareStatus {
    EMPTY("~"),
    SHIP("S"),
    HIT("X"),
    MISSED("O");

    private String character;

    SquareStatus(String character) {
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public String getValue() {
        return name(); // Zwraca nazwę enum jako wartość tekstową
    }

    public static SquareStatus fromValue(String value) {
        for (SquareStatus status : SquareStatus.values()) {
            if (status.name().equals(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid SquareStatus value: " + value);
    }
}

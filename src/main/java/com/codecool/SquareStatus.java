package com.codecool;

enum SquareStatus {
    EMPTY("~"),      // Emoji kółko (○)
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

}

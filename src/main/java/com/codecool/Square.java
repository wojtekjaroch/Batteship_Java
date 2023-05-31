package com.codecool;

class Square {
    private int x;
    private int y;
    private SquareStatus status;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
        status = SquareStatus.EMPTY;
    }

    public String getCharacter() {
        return status.getCharacter();
    }
}

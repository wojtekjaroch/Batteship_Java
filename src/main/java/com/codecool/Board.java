package com.codecool;

class Board {
    private Square[][] ocean;

    public Board() {
        ocean = new Square[10][10];
        initializeOcean();
    }

    private void initializeOcean() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                ocean[x][y] = new Square(x, y);
            }
        }
    }

    public boolean isEmpty(int x, int y) {
        return ocean[x][y].getStatus() != SquareStatus.EMPTY;
    }

    public Square getCell(int x, int y) {
        return ocean[x][y];
    }

    public void setCell(int x, int y, SquareStatus status) {
        ocean[x][y].setStatus(status);
    }
}

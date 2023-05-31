package com.codecool;

class Board {
    private Square[][] ocean; //macierz -> tablica z tablicami,

    public Board() {
        ocean = new Square[10][10];
        // Inicjalizuje tablicę 10 x 10
    }

    public boolean isPlacementOk(Ship ship) {
        // Sprawdza poprawność umieszczenia statku na tablicy
        return false;
    }
}

package com.codecool;

import java.util.ArrayList;
import java.util.List;
class Ship {
    private List<Square> squares; // deklaruje prywatne pole squares, które jest listą obiektów klasy Square.

    public Ship() {
        squares = new ArrayList<>();
    } //definiuje konstruktor dla klasy Ship, który inicjalizuje pole squares jako nową pustą listę obiektów klasy Square.
}

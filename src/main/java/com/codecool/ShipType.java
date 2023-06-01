package com.codecool;

public enum ShipType {
    CARRIER(5),
    BATTLESHIP(4),
    CRUISER(3),
    SUBMARINE(3),
    DESTROYER(2);

    private int length;

    ShipType(int length) {
        this.length = length;
    } //przypisuje wartość parametru length do pola length w obiekcie klasy ShipType. this jest odwołaniem do bieżącego
    // obiektu, umożliwiając odróżnienie pola klasy od parametru o tej samej nazwie. W tym przypadku, this.length
    // odnosi się do pola length klasy ShipType, a length odnosi się do parametru przekazanego do konstruktora.

    public int getLength() {
        return length;
    }
}

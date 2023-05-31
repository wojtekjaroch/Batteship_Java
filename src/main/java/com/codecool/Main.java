package com.codecool;

public class Main {
    public static void main(String[] args) { //  deklaracji metody main parametr String[] args oznacza, że przy uruchomieniu przekazywane są argumenty w postaci tablicy stringów
        Battleship battleship = new Battleship();
        battleship.run();
    }
}
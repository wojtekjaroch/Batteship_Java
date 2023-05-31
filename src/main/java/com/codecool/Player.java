package com.codecool;

import java.util.ArrayList;
import java.util.List;
class Player {
    private List<Ship> ships;

    public Player() {
        ships = new ArrayList<Ship>();
    }

    public void makeMove(Board board, int x, int y) {
        // TODO logika ruchu gracza
    }

    public boolean isAlive() {
        // TODO: czy gracz jest wciąż żywy
        return false;
    }
}

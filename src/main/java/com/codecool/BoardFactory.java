package com.codecool;

import java.util.Random;

public class BoardFactory {
    private static final int BOARD_SIZE = 10;

    private Random random;

    public BoardFactory() {
        random = new Random();
    }

    public Board randomPlacement() {
        Board board = new Board();

        for (ShipType shipType : ShipType.values()) {
            boolean placed = false;
            while (!placed) {
                int x = random.nextInt(BOARD_SIZE);
                int y = random.nextInt(BOARD_SIZE);
                boolean horizontal = random.nextBoolean();

                if (canPlaceShip(board, x, y, shipType, horizontal)) {
                    placeShip(board, x, y, shipType, horizontal);
                    placed = true;
                }
            }
        }

        return board;
    }

    private boolean canPlaceShip(Board board, int x, int y, ShipType shipType, boolean horizontal) {
        int shipLength = shipType.getLength();

        if (horizontal) {
            if (x + shipLength > BOARD_SIZE) {
                return false;
            }

            for (int i = x; i < x + shipLength; i++) {
                if (board.isEmpty(i, y)) {
                    return false;
                }
            }
        } else {
            if (y + shipLength > BOARD_SIZE) {
                return false;
            }

            for (int i = y; i < y + shipLength; i++) {
                if (board.isEmpty(x, i)) {
                    return false;
                }
            }
        }

        return true;
    }

    private void placeShip(Board board, int x, int y, ShipType shipType, boolean horizontal) {
        int shipLength = shipType.getLength();

        if (horizontal) {
            for (int i = x; i < x + shipLength; i++) {
                board.setCell(i, y, SquareStatus.SHIP);
            }
        } else {
            for (int i = y; i < y + shipLength; i++) {
                board.setCell(x, i, SquareStatus.SHIP);
            }
        }
    }



    public Board manualPlacement() {
        // TODO: manualne wygenerowanie i zwrócenie tablicy ze statkami
        return null;
    }
}
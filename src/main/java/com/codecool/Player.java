package com.codecool;

import java.util.ArrayList;
import java.util.List;
class Player {
    private List<Ship> ships;

    public Player() {
        ships = new ArrayList<Ship>();
    }

    public void makeMove(Board opponentBoard, int x, int y) {
        Square targetSquare = opponentBoard.getCell(x, y);

        if (targetSquare.getStatus() == SquareStatus.SHIP) {
            targetSquare.setStatus(SquareStatus.HIT);
            System.out.println("You hit a ship, please continue.");
        } else {
            targetSquare.setStatus(SquareStatus.MISSED);
            System.out.println("You missed!");
        }
    }

    public boolean allShipsSunk(Board board) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board.getCell(j, i).getStatus() == SquareStatus.SHIP) {
                    return false; // Jeśli znajdziemy niezatopiony statek, zwracamy false
                }
            }
        }
        return true; // Jeśli wszystkie statki są zatopione, zwracamy true
    }




}

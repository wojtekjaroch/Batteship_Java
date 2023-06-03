package com.codecool;


import java.util.Random;

public class Game {
    private Player player1;
    private Player player2;
    private BoardFactory boardFactory;
    private Board boardPlayer1;
    private Board boardPlayer2;
    private Display display;
    private Input input;
    private Random random;
    private boolean currentPlayer1;

    public Game() {
        player1 = new Player();
        player2 = new Player();
        boardFactory = new BoardFactory();
        random = new Random();
        input = new Input();
        currentPlayer1 = true;

        // Inicjalizacja tablicy dla Display
        boardPlayer1 = boardFactory.randomPlacement();
        boardPlayer2 = boardFactory.randomPlacement();
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void startNewGame() {
        boardPlayer1 = boardFactory.randomPlacement();
        boardPlayer2 = boardFactory.randomPlacement();

        while (!gameOver()) {
            if (currentPlayer1) {
                display.printMessage(currentPlayer1);
                display.printBoard();
            } else {
                display.printMessage(currentPlayer1);
                display.printBoard();
            }

            display.printGameplay();

            int x = input.getMoveX();
            int y = input.getMoveY();

            if (currentPlayer1) {
                player1.makeMove(boardPlayer2, x, y);
                if (boardPlayer2.getCell(x, y).getStatus() == SquareStatus.HIT) {
                    System.out.println("You hit a ship, please continue");
                    input.setHit(true);
                } else {
                    System.out.println("You missed!");
                    input.setHit(false);
                    currentPlayer1 = false;
                }
            } else {
                player2.makeMove(boardPlayer1, x, y);
                if (boardPlayer1.getCell(x, y).getStatus() == SquareStatus.HIT) {
                    System.out.println("You hit a ship, please continue");
                    input.setHit(true);
                } else {
                    System.out.println("You missed!");
                    input.setHit(false);
                    currentPlayer1 = true;
                }
            }
        }

        boolean player1Won = player2.allShipsSunk(boardPlayer1);
        display.printGameOver(player1Won);
    }

    private boolean gameOver() {
        if (currentPlayer1) {
            return player2.allShipsSunk(boardPlayer1);
        } else {
            return player1.allShipsSunk(boardPlayer2);
        }
    }

    public Board getBoardPlayer1() {
        return boardPlayer1;
    }

    public Board getBoardPlayer2() {
        return boardPlayer2;
    }

    public boolean isCurrentPlayer1() {
        return currentPlayer1;
    }
}

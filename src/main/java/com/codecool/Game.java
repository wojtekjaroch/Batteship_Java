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
        // TODO: dołożyć logikę randomowego rozłożenia dla gracza player1

        boardPlayer2 = boardFactory.randomPlacement();
        // TODO: dołożyć logikę randomowego rozłożenia dla gracza player2

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
                if (!input.isHit()) {
                    currentPlayer1 = false;
                }
            } else {
                player2.makeMove(boardPlayer1, x, y);
                if (!input.isHit()) {
                    currentPlayer1 = true;
                }
            }
        }

        boolean player1Won = player1.isAlive();
        display.printGameOver(player1Won);
    }

    private boolean gameOver() {
        // TODO: dopisać warunek do Game over
        return false;
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

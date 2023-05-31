package com.codecool;

import java.util.Random;

import com.codecool.Display;
import com.codecool.Input;

class Game {
    private Player player;
    private BoardFactory boardFactory;
    private Board board;
    private Display display;
    private Input input;
    private Random random;

    public Game() {
        player = new Player();
        boardFactory = new BoardFactory();
        random = new Random();
        display = new Display();
        input = new Input();
    }

    public void startNewGame() {
        board = boardFactory.randomPlacement();
        // TODO: dołożyć logikę randomowego rozłożenia

        while (!gameOver()) {
            display.printBoard(board);
            display.printGameplay();

            int x = input.getMoveX();
            int y = input.getMoveY();

            player.makeMove(board, x, y);
        }

        boolean playerWon = player.isAlive();
        display.printGameOver(playerWon);
    }

    private boolean gameOver() {
        // TODO: dopisać warunek do Game over
        return false;
    }
}

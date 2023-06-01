package com.codecool;

public class Battleship {
    private Display display;
    private Input input;
    private Game game;

    public Battleship() {
        game = new Game();
        display = new Display(game);
        game.setDisplay(display);
        input = new Input();
    }

    public void run() {
        while (true) {
            display.printMainMenu();
            int choice = input.getMainMenuChoice();

            switch (choice) {
                case 1:
                    game.startNewGame();
                    break;
                case 2:
                    display.printHighScores();
                    break;
                case 3:
                    return;
                default:
                    display.printInvalidChoice();
            }
        }
    }

    public static void main(String[] args) {
        Battleship battleship = new Battleship();
        battleship.run();
    }
}

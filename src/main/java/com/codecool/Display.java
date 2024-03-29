package com.codecool;

class Display {
    private Game game;

    public Display(Game game) {
        this.game = game;
    }

    public void printMainMenu() {
        System.out.println("=== BATTLESHIP ===");
        System.out.println("1. Start New Game");
        System.out.println("2. Display High Scores");
        System.out.println("3. Exit");
    }

    public void printBoard() {
        Board boardPlayer1 = game.getBoardPlayer1();
        Board boardPlayer2 = game.getBoardPlayer2();

        System.out.println("=== BOARD ===");
        System.out.println("   0 1 2 3 4 5 6 7 8 9");

        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print((i) + "  ");
            } else {
                System.out.print((i) + "  ");
            }

            for (int j = 0; j < 10; j++) {
                Square square;
                if (game.isCurrentPlayer1()) {
                    square = boardPlayer1.getCell(j, i);
                } else {
                    square = boardPlayer2.getCell(j, i);
                }

                String character = square.getStatus().getCharacter();
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }


    public void printGameplay() {
        // Printuje informację o gameplay
    }

    public void printGameOver(boolean playerWon) {
        if (playerWon) {
            System.out.println("Congratulations! You won the game!");
        } else {
            System.out.println("Game over! You lost.");
        }
    }

    public void printHighScores() {
        System.out.println("=== HIGH SCORES ===");
        // Printuje HighScores
    }

    public void printMessage(boolean currentPlayer1) {
        if (currentPlayer1) {
            System.out.println("It is Player1's turn");
        } else {
            System.out.println("It is Player2's turn");
        }
    }

    public void printInvalidChoice() {
        System.out.println("Invalid choice. Please try again.");
    }

}

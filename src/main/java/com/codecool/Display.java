package com.codecool;

class Display {
    public void printMainMenu() {
        System.out.println("=== BATTLESHIP ===");
        System.out.println("1. Start New Game");
        System.out.println("2. Display High Scores");
        System.out.println("3. Exit");
    }

    public void printBoard(Board board) {
        System.out.println("=== BOARD ===");
        System.out.println("   A B C D E F G H I J");

        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.print(i + "  ");
            } else {
                System.out.print(i + " ");
            }

            for (int j = 1; j <= 10; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        // Printuje tablicę pustą (bez statków)
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

    public void printInvalidChoice() {
        System.out.println("Invalid choice. Please try again.");
    }
}

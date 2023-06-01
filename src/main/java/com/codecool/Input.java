package com.codecool;

import java.util.Scanner;

class Input {
    private Scanner scanner;
    private boolean hit;

    public Input() {
        scanner = new Scanner(System.in);
        hit = false;
    }

    public int getMainMenuChoice() {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 3) {
                    return choice;
                }
            } catch (NumberFormatException e) {
                // Ignore and continue loop
            }
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public int getMoveX() {
        System.out.print("Enter X coordinate: ");
        while (true) {
            try {
                int x = Integer.parseInt(scanner.nextLine());
                if (x >= 0 && x < 10) {
                    return x;
                }
            } catch (NumberFormatException e) {
                // Ignore and continue loop
            }
            System.out.println("Invalid coordinate. Please try again.");
        }
    }

    public int getMoveY() {
        System.out.print("Enter Y coordinate: ");
        while (true) {
            try {
                int y = Integer.parseInt(scanner.nextLine());
                if (y >= 0 && y < 10) {
                    return y;
                }
            } catch (NumberFormatException e) {
                // Ignore and continue loop
            }
            System.out.println("Invalid coordinate. Please try again.");
        }
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public void close() {
        scanner.close();
    }

    public void markMiss(int x, int y) {
        // Implementacja oznaczania nietrafionego strzału na planszy
        // Możesz dostosować tę implementację do swoich potrzeb
        // Tutaj dodajemy znak "-" na planszy i wyświetlamy komunikat o nietrafionym strzale
        System.out.println("You missed!");
    }
}

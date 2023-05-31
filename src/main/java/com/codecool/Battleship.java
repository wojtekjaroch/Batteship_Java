package com.codecool;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Battleship { // ta klasa zawiera logikę gry Battleship
    private Display display; // będzie przechowywać obiekty klasy display
    private Input input; // będzie przechowywać obiekty klasy input
    private Game game; // będzie przechowywać obiekty klasy game

    public Battleship() {           // Konstruktor klasy Battleship. Tworzy on nowe obiekty display, input i game, używając ich konstruktorów domyślnych.
                                    // Inicjalizuje te pola nowo utworzonymi obiektami.
        display = new Display();
        input = new Input();
        game = new Game();
    }

    public void run() { // void, więc nie zwraca wartości. ta metoda odpowiada za główną logikę gry
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
                    return; // przy wyborze zakończenia programu
                default:
                    display.printInvalidChoice();
            }
        }
    }

    public static void main(String[] args) {//Metoda main jest punktem wejścia do programu. Tworzy nowy obiekt klasy Battleship
                                            // o nazwie battleship i wywołuje na nim metodę run(), rozpoczynając działanie gry.
        Battleship battleship = new Battleship();
        battleship.run();
    }
}

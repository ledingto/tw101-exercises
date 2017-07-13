package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String msg;

        // create game, which generates the random number to guess between 0 and 100
        GuessingGame game = new GuessingGame(101);

        // prompt user
        System.out.print("Please guess an integer between 0 and 100: ");

        do {
            msg = game.guess(scanner.nextInt());
            System.out.print(msg);
        }
        while (!(msg.equals("You win!")));

    }
}

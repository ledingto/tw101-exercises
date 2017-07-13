package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

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

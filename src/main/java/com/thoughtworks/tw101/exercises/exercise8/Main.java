package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

/*
Because I use the Scanner class to read the input, and nextInt() as the method, the scanner expects the user to
enter an integer. If the user enters input other than an integer, the scanner throws an InputMismatchException.
Therefore, a NumberFormatException will not be thrown unless the scanner allows a 'misread' (i.e. accepting
unexpected input). For this reason I catch a InputMismatchException instead.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> guessHistory = new ArrayList<Integer>();

        // create game, which generates the random number to guess between 0 and 100
        GuessingGame game = new GuessingGame(101);

        // prompt user
        System.out.print("Please guess an integer between 0 and 100: ");

        try {
            String msg;
            do {
                int userGuess = scanner.nextInt();
                guessHistory.add(userGuess);
                msg = game.guess(userGuess);
                System.out.print(msg);
            }
            while (!(msg.equals("You win!")));

            System.out.println("\nYou guessed " + game.getGuessCount() + " times.");
            System.out.print("Your guesses were: ");
            for (int i=0; i<guessHistory.size(); i++) {
                if (i==guessHistory.size()-1) {
                    System.out.println(guessHistory.get(i) + ".");
                }
                else {
                    System.out.print(guessHistory.get(i) + ", ");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("The input you entered cannot be accepted. \nPlease try again, and enter an integer " +
                    "between 0 and 100 to play the game.");
        }

    }
}

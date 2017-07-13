package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random numGen = new Random();

        int number = numGen.nextInt(101);

        System.out.print("Guess an integer number between 1 and 100: ");
        int guess = scanner.nextInt();

        do {
            if (guess < number) {
                System.out.print("\nYou guessed too low. ");
            }
            else if (guess > number) {
                System.out.print("\nYou guessed too high. ");
            }
            else { break; }

            System.out.print("Please guess again: ");
            guess = scanner.nextInt();
        }
        while (guess != number);

        System.out.println("\nYou win! You guessed: " + guess + " and the number was: " + number + ".");
    }
}

package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

public class GuessingGame {

    private int randNum;

    Random generator = new Random();

    // range: all 2^32 possible int values
    public GuessingGame() {
        randNum = generator.nextInt();
    }

    // range: [0, upperBound)
    public GuessingGame(int upperBound) {
        randNum = generator.nextInt(upperBound);
    }

    public String guess(int guess) {
        if (guess>randNum) {
            return "You guessed too high. Please guess again: ";
        }
        else if (guess<randNum) {
            return "You guessed too low. Please guess again: ";
        }
        else {
            return "You win!";
        }
    }

}
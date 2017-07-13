package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

public class GuessingGame {

    private int randNum;
    private int guessCount = 0;

    Random generator = new Random();

    // range: all 2^32 possible int values
    public GuessingGame() {
        randNum = generator.nextInt();
    }

    // range: [0, upperBound)
    public GuessingGame(int upperBound) {
        randNum = generator.nextInt(upperBound);
    }

    public int getGuessCount() {
        return guessCount;
    }

    public String guess(int guess) {
        guessCount++;
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
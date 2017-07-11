package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int numIncrements;

    public Accumulator() {
        numIncrements = 0;
    }

    public void increment() {
        numIncrements += 1;
    }

    public int total() {
        return numIncrements;
    }

}

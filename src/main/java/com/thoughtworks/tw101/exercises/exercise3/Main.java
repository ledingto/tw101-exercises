package com.thoughtworks.tw101.exercises.exercise3;

public class Main {

//    Exercise #3: Create a function 'of' in the class OddSum that returns the sum of all odd integers between a starting
//    and ending integer value.

    public static void main(String[] args) {
        OddSum oddSum = new OddSum();

        Integer sum2500 = oddSum.of(1, 100);
        Integer sum16 = oddSum.of(0, 8);
        Integer sumOpp = oddSum.of(-200, 199);
        Integer sumSame = oddSum.of(5, 5);

        System.out.println(sum2500);
        System.out.println(sum16);
        System.out.println(sumOpp);
        System.out.println(sumSame);
    }
}

package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer n will return a list of integers such that the numbers
//  are the prime factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {

        List<Integer> primeFactors1 = generate(30);
        //List<Integer> primeFactors2 = generate(1);
        //List<Integer> primeFactors3 = generate(79);
        //List<Integer> primeFactors4 = generate(12);
        //List<Integer> primeFactors5 = generate(1000);

        System.out.print(primeFactors1);

    }

    // factor of n: n%i==0
    // use pre-computed list of primes to only check factors [that are also prime]
    private static List<Integer> generate(int n) {
        ArrayList<Integer> primes = firstNPrimes(n);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int primeNum : primes) {
            if (n%primeNum==0) {
                    list.add(primeNum);
            }
        }

        return list;
    }

    /*
    To improve runtime: store list of first 1000 prime numbers. Only check if these are factors of n if n<1000.
     */
    private static ArrayList<Integer> firstNPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i=0; i<n+1; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        else if (n==2) {
            return true;
        }
        else if (n%2==0) {
            return false;
        }
        // check if divisible by odd numbers (because if divisible by even number, already caught by n%2==0 )
        // prime definition: only divisible by 1 and itself
        else {
            for (int i=3; i<n; i+=2) {
                if (n%i==0) {
                    return false;
                }
            }
            return true;
        }
    }
}

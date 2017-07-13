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
        List<Integer> primeFactors2 = generate(1);
        //List<Integer> primeFactors3 = generate(79);
        //List<Integer> primeFactors4 = generate(1000);
        //List<Integer> primeFactors5 = generate(999);

        System.out.println(primeFactors1);
        System.out.println(primeFactors2);

    }

    // factor of n: n%i==0
    // prime:
    private static List<Integer> generate(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<=n; i++) {
            // if the number is a factor of n and is also prime --> prime factor
            if (n%i==0 && isPrime(i)) {
                    list.add(i);
            }
        }
        return list;
    }


    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        else if (n==2) {
            return true;
        }
        // no even number is prime (except 2... see above)
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
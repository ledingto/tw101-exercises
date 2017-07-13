package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        //drawAnIsoscelesTriangleReverse(3);
        System.out.println();
        drawADiamond(8);
        System.out.println();
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {

        // n represents the number of rows
        // number of columns (stars) is (n*2-1)
        // so number of spaces in the first row is (n*2-1)/2 and one less space in front for each row after

        int numSpaces = (n*2-1)/2;
        int numStars = 1;

        for (int i=0; i<n; i++) {
            for (int j=0; j<numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<numStars; k++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces--;
            numStars+=2;
        }
    }

    private static void drawAnIsoscelesTriangleReverse(int n) {
        int numSpaces = 0;
        int numStars = (n*2)-1;

        for (int i=0; i<n; i++) {
            for (int j=0; j<numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<numStars; k++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces++;
            numStars-=2;
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        // top of diamond
        drawAnIsoscelesTriangle(n);
        // bottom of diamond -- use code for drawAnIsoscelesTriangleReverse with minor tweaks
        int numSpaces = 0;
        int numStars = ((n-1)*2)-1;

        for (int i=0; i<n-1; i++) {
            // extra space in front of each line to align bottom with top
            System.out.print(" ");
            for (int j=0; j<numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<numStars; k++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces++;
            numStars-=2;
        }

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        // top of diamond -- use n-1 because nth line is your name
        int numSpaces = ((n-1)*2-1)/2;
        int numStars = 1;

        for (int i=0; i<n-1; i++) {
            // extra space for alignment purposes
            System.out.print(" ");
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < numStars; k++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces--;
            numStars += 2;
        }
        // print your name
        System.out.println("Laura");
        // bottom of diamond -- use n-1 because nth line is your name
        numSpaces = 0;
        numStars = ((n-1)*2)-1;

        for (int i=0; i<n-1; i++) {
            // extra space in front of each line to align bottom with top
            System.out.print(" ");
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < numStars; k++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces++;
            numStars -= 2;
        }
    }
}

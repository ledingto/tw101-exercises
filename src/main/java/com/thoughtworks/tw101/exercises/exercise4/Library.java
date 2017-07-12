package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {

        for (int i=0; i<books.length; i++) {
            if (books[i].contains(partialBookTitle)) {
                printStream.print(books[i] + ", ");
            }
        }
        printStream.println();
    }

    public void printBooksContainingPretty(String partialBookTitle) {

        printStream.print("Book titles containing \"" + partialBookTitle + "\": ");

        ArrayList<String> booksSublist = new ArrayList<String>();
        for (int i=0; i<books.length; i++) {
            if (books[i].contains(partialBookTitle)) {
                booksSublist.add(books[i]);
            }
        }

        int j=0;
        while (j<booksSublist.size()) {
            if (j==booksSublist.size()-1) {
                printStream.println(booksSublist.get(j) + ".");
            }
            else {
                printStream.print(booksSublist.get(j) + ", ");
            }
            j++;
        }
    }
}

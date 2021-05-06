package com.alexisraels;

public class Main {

    public static void main(String[] args) {
	    int myVariable=50;  // Statement = int myVariable=50; (entire line)
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is " +         // All 3 lines are one statement
                "another" +
                " still more");

        int anotherVariable = 50;myVariable--;  // 2 statements on one line
    }
}

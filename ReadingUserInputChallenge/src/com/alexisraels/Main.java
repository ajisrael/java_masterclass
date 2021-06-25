package com.alexisraels;

import java.util.Scanner;

public class Main {
    // Challenge:
    // Read 10 numbers from the console entered by the user and print the sum of those numbers.
    // Create a Scanner like we did in the previous video.
    // Use the hasNextInt() method from the scanner to check if the user has entered an int value.
    // If hasNextInt() returns false, print hte message "Invalid Number". Continue reading until
    // you have read 10 numbers.
    // Use the nextInt() method to get the number and add it to the sum.
    // Before the user enters each number, print the message "Enter number #x:" where x represents
    // the count, i.e. 1, 2, 3, 4, etc.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            int displayNumber = counter + 1;
            System.out.print("Enter number #" + displayNumber + ": ");

            if (scanner.hasNextInt()) {
                int newNumber = scanner.nextInt();
                sum += newNumber;
                counter++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); // skip over new line character from number entry
        }

        scanner.close();

        System.out.println("Sum = " + sum);
    }
}

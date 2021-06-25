package com.alexisraels;

import java.util.Scanner;

public class Main {

    // Challenge:
    // Read the numbers from the console entered by the user and print the minimum and maximum number the user
    // has entered.
    // Before the user enters the number, print the message "Enter number".
    // If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                max = Integer.max(number, max);
                min = Integer.min(number, min);
            } else {
                break;
            }

            scanner.nextLine();
        }

        scanner.close();

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}

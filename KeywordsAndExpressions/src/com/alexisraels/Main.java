package com.alexisraels;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometres
        double kilometers = (100 * 1.609344);   // expression = "kilometers = (100 * 1.609344)"

        int highscore = 50;                     // expression = "highscore = 50"
        if (highscore == 50) {                  // expression = "highscore == 50"
            System.out.println("This is an expression");
        }

        // Challenge
        // In the following code below, write down what parts of the code are expressions.
        int score = 100;                                    // score = 100
        if (score > 99) {                                   // score > 99
            System.out.println("You go the high score!");   // "You got the high score!"
            score = 0;                                      // score = 0;
        }
    }
}

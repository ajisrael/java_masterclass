package com.alexisraels;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Alex", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        // Challenge
        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters both of type double.
        // feet is the first parameter, inches is the second parameter
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the second parameter inches is >= 0 and <= 12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a second method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >= 0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then her is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: use double for your number data types is probably a good idea
        // 1 inch = 2.54cm and one foot = 12 inches

        double feet = 10d;
        double inches = 8d;
        double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        inches = 300d;
        centimeters = calcFeetAndInchesToCentimeters(inches);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters = -1d;
        if ((feet >= 0) && (inches >= 0) && (inches <= 12)) {
            double feetToInches = 12d;
            double totalInches = feet * feetToInches + inches;
            double inchesToCentimeters = 2.54d;
            centimeters = totalInches * inchesToCentimeters;
            System.out.println(feet + "ft and " + inches + "in = " + centimeters + " cm");
        }
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double centimeters = -1d;
        if (inches >= 0) {
            double inchesToFeet = 12d;
            double feet = (int) (inches / inchesToFeet);
            inches = (int) (inches % inchesToFeet);
            centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        }
        return centimeters;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }


}

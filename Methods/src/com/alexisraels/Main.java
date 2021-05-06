package com.alexisraels;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should take a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " an the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // then return data should be
        // 1 if the score is >= 1000
        // 2 if the score is >= 500 and < 1000
        // 3 if the score is >= 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50
        //

        displayHighScorePosition("Bill",   calculateHighScorePosition(1500));
        displayHighScorePosition("Steve",  calculateHighScorePosition( 900));
        displayHighScorePosition("Jessie", calculateHighScorePosition( 400));
        displayHighScorePosition("Andrew", calculateHighScorePosition(  50));

    }

    public static void displayHighScorePosition(String playerName, int tablePosition) {
        System.out.println(playerName + " managed to get into position " +
                tablePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int highScorePosition = 4;  // if conditions aren't met default to 4

        if (playerScore >= 1000) {
            highScorePosition = 1;
        } else if (playerScore >= 500) {
            highScorePosition = 2;
        } else if (playerScore >= 100) {
            highScorePosition = 3;
        }

        return highScorePosition;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = -1;

        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
        }

        return finalScore;
    }

}

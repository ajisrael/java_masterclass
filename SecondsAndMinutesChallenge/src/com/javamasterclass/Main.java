package com.javamasterclass;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "invalid value";

    public static void main(String[] args) {
        System.out.print("This should be invalid: ");
        System.out.println(getDurationString( -1, 50));

        System.out.print("This should be invalid: ");
        System.out.println(getDurationString( 500, -2));

        System.out.print("This should be invalid: ");
        System.out.println(getDurationString( 500, 500));

        System.out.print("This should be valid: ");
        System.out.println(getDurationString( 61, 0));

        System.out.print("This should be valid: ");
        System.out.println(getDurationString( 360, 44));

        System.out.print("This should be invalid: ");
        System.out.println(getDurationString( -10));

        System.out.print("This should be valid: ");
        System.out.println(getDurationString( 61));

        System.out.print("This should be valid: ");
        System.out.println(getDurationString( 50000));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutesToHours = 60;
        int hours = minutes / minutesToHours;
        int remainingMinutes = minutes % minutesToHours;

        boolean singleDigitHours = (hours / 10) == 0;
        boolean singleDigitMinutes = (remainingMinutes / 10) == 0;
        boolean singleDigitSeconds = (seconds / 10) == 0;

        String hoursString = singleDigitHours ? "0" + hours + "h" : hours + "h";
        String minutesString = singleDigitMinutes ? "0" + remainingMinutes + "m" : remainingMinutes + "m";
        String secondsString = singleDigitSeconds ? "0" + seconds + "s" : seconds + "s";

        return hoursString + " " + minutesString + " " + secondsString;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int secondsToMinutes = 60;
        int minutes = seconds / secondsToMinutes;
        int remainingSeconds = seconds % secondsToMinutes;
        return getDurationString(minutes, remainingSeconds);
    }

}

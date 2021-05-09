public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0L) {
            System.out.println("Invalid Value");
        } else {
            long minutesToDays = 60L * 24L;
            long minutesToYears = minutesToDays * 365;

            long years = minutes / minutesToYears;
            long remainingMinutes = minutes % minutesToYears;
            long days = remainingMinutes / minutesToDays;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}

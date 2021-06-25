import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine(); // handle enter key
                count++;
                sum += number;
            } else {
                break;
            }
        }

        int average = Math.round((float) sum / (float) count);

        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();
    }
}

public class DigitSum {

    public static void main(String[] args) {
        int number = 1234;
        System.out.println(sumDigits(number));
    }

    private static int sumDigits (int number) {
        if (number < 10) {
            return -1;
        }

        final int base = 10;

        int sum = 0;

        while (number > 0) {
            sum += number % base;
            number /= base;
        }

        return sum;
    }
}

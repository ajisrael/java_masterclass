public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int base = 10;

        while (number != 0) {
            int n = number % base;
            if (n % 2 == 0) {
                sum += n;
            }
            number /= base;
        }

        return sum;
    }
}

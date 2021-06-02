public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int n = number;
        int sum = n % 10;

        while (n >= 10) {
            n /= 10;
        }

        sum += n % 10;

        return sum;
    }
}

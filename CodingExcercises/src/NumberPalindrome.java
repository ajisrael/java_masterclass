public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(-232325);
    }

    public static boolean isPalindrome(int number) {
        int numberCopy = number;
        int reverse = 0;

        while (numberCopy != 0) {
            reverse *= 10;
            reverse += numberCopy % 10;
            numberCopy /= 10;
        }

        return reverse == number;
    }
}

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 42));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99) {
            return false;
        }

        if (num2 < 10 || num2 > 99) {
            return false;
        }

        int n1 = num1;
        int n2 = num2;

        while (n1 != 0) {

            int digit1 = n1 % 10;

            while (n2 != 0) {

                int digit2 = n2 % 10;

                if (digit1 == digit2) {
                    return true;
                }

                n2 /= 10;
            }

            n2 = num2;
            n1 /= 10;
        }

        return false;
    }
}

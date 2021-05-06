public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int offset = 1000;
        return ((int) (num1 * offset) - (int) (num2 * offset)) == 0;
    }
}

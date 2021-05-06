public class TeenNumberChecker {
    public static boolean hasTeen(int int1, int int2, int int3) {
        return isTeen(int1) || isTeen(int2) || isTeen(int3);
    }

    public static boolean isTeen(int num) {
        return (num >= 13 && num <= 19);
    }
}

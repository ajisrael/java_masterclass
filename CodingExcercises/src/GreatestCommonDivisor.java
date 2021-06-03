public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(300000,18));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
        {
            return -1;
        }

        int max = Math.max(first, second);
        int min = Math.min(first, second);

        int maxDenom = -1;

        for (int i = min; i >= 2; i--)
        {
            if ((min % i == 0) && (max % i == 0))
            {
                maxDenom = i;
                break;
            }

        }

        return maxDenom;
    }
}

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrime = -1;

        for (int i = 2; i <= number; i++)
        {
            if (number % i == 0)
            {
                boolean isNotPrime = false;

                for (int j = 2; j < i; j++)
                {
                    isNotPrime |= i % j == 0;
                }

                if (!isNotPrime)
                {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }
}

public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        String factors = "1";

        if (number > 1)
        {
            for (int i = 2; i < number; i++)
            {
                if (number % i == 0) {
                    factors += " " + i;
                }
            }

            factors += " " + number;
        }

        System.out.println(factors);
    }
}

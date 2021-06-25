public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(15);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        String output = "";

        for (int row = 1; row <= number; row++)
        {
            for (int column = 1; column <= number; column++)
            {
                if (row == 1 || row == number || column == 1 || column == number || row == column || column == (number - row + 1))
                {
                    output += "*";
                }
                else
                {
                    output += " ";
                }

                if (column == number && row != number)
                {
                    output += "\n";
                }
            }
        }

        System.out.print(output);
    }
}

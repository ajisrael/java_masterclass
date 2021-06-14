public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reverse = reverse(number);
        int digitCount = getDigitCount(number);
        int currentDigit = 0;

        String message = "";

        while (reverse >= 0) {
            int numberToPrint = reverse % 10;
            currentDigit++;

            if (reverse == 0) {
                if (digitCount - currentDigit > 1) {
                    numberToPrint = 0;
                }
            }

            reverse /= 10;

            switch (numberToPrint) {
                case 0:
                    message += "Zero";
                    break;
                case 1:
                    message += "One";
                    break;
                case 2:
                    message += "Two";
                    break;
                case 3:
                    message += "Three";
                    break;
                case 4:
                    message += "Four";
                    break;
                case 5:
                    message += "Five";
                    break;
                case 6:
                    message += "Six";
                    break;
                case 7:
                    message += "Seven";
                    break;
                case 8:
                    message += "Eight";
                    break;
                case 9:
                    message += "Nine";
                    break;
            }

            if (currentDigit == digitCount) {
                break;
            }

            message += " ";
        }

        System.out.println(message);

    }

    public static int reverse(int number) {

        int reversed = 0;
        int digit = (int) Math.pow(10, (getDigitCount(Math.abs(number)) - 1));

        while (number != 0) {
            reversed += ((number % 10) * digit);
            number /= 10;
            digit /= 10;
        }

        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;

        while (number >= 0){
            number /= 10;
            count++;
            if (number == 0) {
                break;
            }
        }

        return count;
    }
}

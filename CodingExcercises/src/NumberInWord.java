public class NumberInWord {
    public static void printNumberInWord(int number) {
        String reply = "";
        switch(number) {
            case 0:
                reply = "ZERO";
                break;
            case 1:
                reply = "ONE";
                break;
            case 2:
                reply = "TWO";
                break;
            case 3:
                reply = "THREE";
                break;
            case 4:
                reply = "FOUR";
                break;
            case 5:
                reply = "FIVE";
                break;
            case 6:
                reply = "SIX";
                break;
            case 7:
                reply = "SEVEN";
                break;
            case 8:
                reply = "EIGHT";
                break;
            case 9:
                reply = "NINE";
                break;
            default:
                reply = "OTHER";
                break;
        }
        System.out.println(reply);
    }
}

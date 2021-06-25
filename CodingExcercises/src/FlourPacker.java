public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean canPack = false;

        int sum = bigCount * 5 + smallCount;

        if (sum >= goal) {

            int bigCountsAcceptable = goal / 5;

            if (bigCount >= bigCountsAcceptable) {
                goal -= bigCountsAcceptable * 5;
            } else {
                goal -= bigCount * 5;
            }

            if (smallCount >= goal) {
                canPack = true;
            }
        }

        return canPack;
    }
}

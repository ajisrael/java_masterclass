public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        boolean wakeUp = false;
        if (hourOfDay >= 0 && hourOfDay <= 23) {
           if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
               wakeUp = true;
           }
        }
        return wakeUp;
    }
}

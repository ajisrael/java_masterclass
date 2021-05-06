public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int ratio = 1024;
            int megaBytes = kiloBytes / ratio;
            int newKiloBytes = kiloBytes % ratio;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + newKiloBytes + " KB");
        }
    }
}

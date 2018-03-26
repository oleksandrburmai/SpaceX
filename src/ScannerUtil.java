import java.util.Scanner;

public class ScannerUtil {

    private static Scanner scanner;

    private ScannerUtil() throws IllegalStateException {
    }

    private static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static String getString() {
        return getScanner().nextLine();
    }
}

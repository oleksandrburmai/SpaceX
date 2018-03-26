import java.util.Scanner;

public class LazyScannerInitializationUtil {

    private static Scanner scanner;

    public static String getScannerString() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner.nextLine();
    }
}

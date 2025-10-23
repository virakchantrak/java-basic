package contructor.exercise;

import java.util.Scanner;

public class Utils {
    public static String getString(String label) {
        System.out.println(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static double getDouble(String label) {
        return Double.parseDouble(getString(label));
    }
}

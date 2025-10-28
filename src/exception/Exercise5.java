package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// throws keyword example
public class Exercise5 {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            readFile("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}

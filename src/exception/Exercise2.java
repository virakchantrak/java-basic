package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Checked Exception
public class Exercise2 {
    public static void main(String[] args) {
        // read file
        File file = new File("non_existent_file.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

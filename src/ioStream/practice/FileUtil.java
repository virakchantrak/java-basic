package ioStream.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String fileName = "/C:/Users/virakchantrak.son/Downloads/output.txt";

    public static void saveToFile(String data) {
        File file = new File(fileName);

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Data saved to file successfully.");
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static List<String> readFromFile() {
        File file = new File(fileName);
        List<String> stringList = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // bufferedReader.readLine();
            String line = null;
            do {
                line = bufferedReader.readLine();
                if (line != null ) {
                    stringList.add(line);
                }
            } while (line != null);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch ( IOException e) {
            System.out.println("Error reading line: " + e.getMessage());
        }

        return stringList;
    }
}

package ioStream;

import java.io.FileReader;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:/Users/virakchantrak.son/Downloads/input.txt");
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

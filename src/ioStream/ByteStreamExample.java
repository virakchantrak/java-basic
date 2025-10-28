package ioStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamExample {
    public static void main(String[] args) {
        // Read
        try {
            FileInputStream fis = new FileInputStream("/C:/Users/virakchantrak.son/Downloads/output.txt");
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
            fis.close();
        } catch (Exception e) {
            System.out.println( "An error occurred: " + e.getMessage());
        }

        // Write
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/virakchantrak.son/Downloads/output.txt");
            String data = "Hello, this is a byte stream example!";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written to file successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


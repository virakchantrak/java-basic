package forLoop;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of words: ");
        int n = scanner.nextInt();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i<= n; i++) {
            System.out.println("Word " + i + ":");
            String word = scanner.next();
            char lastChar = word.charAt(word.length() - 1);
            if (Character.isAlphabetic(lastChar)) {
                text.append(word).append(" ");
            } else {
                System.out.println("Word can not end with " + lastChar);
            }
        }
        System.out.println(text);

    }

}

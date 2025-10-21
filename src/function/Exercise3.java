package function;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        getArray(3);
    }

    public static void getArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element: " + (i + 1));
            arr[i] = scanner.nextInt();
        }

        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }
}


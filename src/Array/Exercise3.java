package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Number "+ (i + 1) + ":");
            a[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}

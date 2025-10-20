package Array;

import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80};

        // Any element is greater than 60 add more 20
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 60) {
                a[i] = a[i] + 20;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

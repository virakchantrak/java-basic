package Array;

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int indexToAdd = 0;
        int newValue = 0;

        int[] b = new int[a.length + 1];

        // Step 1: Copy from a to b
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[indexToAdd] = newValue;

        // Step 2:
        for (int i = indexToAdd + 1; i < b.length; i++) {
            b[i] = a[i-1];
        }

        System.out.println(Arrays.toString(b));
    }
}

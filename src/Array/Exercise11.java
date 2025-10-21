package Array;

import java.util.Arrays;

/**
 * Add multiple array to specific index
 */
public class Exercise11 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int indexToAdd = 1;
        int[] valueToAdd = {12, 14, 16, 18};
        int[] b = new int[a.length + valueToAdd.length];

        for (int i = 0; i < a.length; i++) {
            if (i < indexToAdd) {
                b[i] = a[i];
            } else {
                b[i + valueToAdd.length] = a[i];
            }
        }
        for (int i = 0; i < valueToAdd.length; i++) {
            b[indexToAdd + i] = valueToAdd[i];
        }

        System.out.println(Arrays.toString(b));

    }
}

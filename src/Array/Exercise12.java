package Array;

import java.util.Arrays;

/**
 * Remove specific duplicate elements from array
 * a = {1,2,3,4,3,5,3,6}
 * target = 3
 * expect result = {1,2,3,4,5,6}
 */
public class Exercise12 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 3, 5, 3, 6};
        int target = 3;
        int count = 0;
        boolean firstFound = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                if (!firstFound) {
                    firstFound = true;
                } else {
                    count++;
                }
            }
        }

        int[] b = new int[a.length - count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != target || (a[i] == target && firstFound)) {
                b[index++] = a[i];
                if (a[i] == target) {
                    firstFound = false;
                }
            }
        }

        System.out.println(Arrays.toString(b));
    }
}

package Array;

import java.util.Arrays;

// Sorting Array
public class Exercise13 {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4, 6, 5};
        for (int i = 0; i < a.length; i ++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

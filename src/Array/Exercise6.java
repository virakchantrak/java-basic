package Array;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int newElement = 5;
        int[] b = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[b.length -1] = newElement;
        System.out.println(Arrays.toString(b));
    }
}

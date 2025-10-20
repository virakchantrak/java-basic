package Array;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        int[] n = new int[5];

        for (int i = 0; i<n.length; i++) {
            n[i] = 4 * i + 5;
        }
        System.out.println(Arrays.toString(n));
    }
}

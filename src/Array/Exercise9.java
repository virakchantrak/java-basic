package Array;

import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {
        //index:   0,1,2,3,4,5,6,7,8
        int[] a = {1,2,3,4,5,6,7,8,9};
        int indexToDelete = 5;
        //index:   0,1,2,3,4,5,6,7
        int[] b = new int[a.length - 1];

        System.out.println("Array A: " + Arrays.toString(a));

        // Step1: Keep index < 5
        for (int i = 0; i < indexToDelete; i++) {
            b[i] = a[i];
        }
        System.out.println("Keep index < 5");
        System.out.println("Array B:" + Arrays.toString(b));

        // Step2: Skip index 5, copy from index 6 to end
        for (int i = indexToDelete; i < b.length; i ++) {
            b[i] = a[i + 1];
        }

        System.out.println("Copy index > 5");
        System.out.println(Arrays.toString(b));
    }
}

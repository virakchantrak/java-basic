package Array;

import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 9, 7, 9, 11, 13, 9, 15, 17, 19, 21};
        int target = 9;
        int count = 0;

        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i <numbers.length; i++) {
            if (numbers[i] == target) {
                count ++;
            }
        }

        int[] newNumbers = new int[numbers.length - count];
        int index = 0;
        for (int i = 0; i <numbers.length; i++) {
            if (numbers[i] != target) {
                newNumbers[index] = numbers[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newNumbers));
    }
}

package Array;

public class Exercise2 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

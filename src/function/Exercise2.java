package function;

public class Exercise2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        findMax(arr);
    }
    public static void findMax(int[] arr) {
        int maxNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
            }
        }
        System.out.println(maxNumber);
    }
}

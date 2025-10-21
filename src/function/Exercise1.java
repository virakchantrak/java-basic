package function;

public class Exercise1 {
    public static void main(String[] args) {
        power(2, 4);
    }

    public static void power(int n, int m) {
        int result = 1;
        for (int i = 1; i <= m; i++) {
            result = result * n;
        }
        System.out.println(result);
    }
}

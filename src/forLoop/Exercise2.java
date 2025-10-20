package forLoop;

public class Exercise2 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 5; i ++) {
            total += 2 * i -1;
            if (i == 3) {
                break;
            }
        }
        System.out.println(total);
    }
}

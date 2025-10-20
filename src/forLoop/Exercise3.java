package forLoop;

public class Exercise3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if (i == 3 || i == 6) {
                continue;
            }
            System.out.println("Number: " + i);
        }
    }
}

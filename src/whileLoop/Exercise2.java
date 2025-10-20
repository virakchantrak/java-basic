package whileLoop;

public class Exercise2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            i++;
            if (i % 2 == 0) {
                System.out.println("Event number: " + i);
            }
        }
    }
}

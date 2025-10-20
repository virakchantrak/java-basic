package whileLoop;

public class Exercise4 {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            int multiplicationOfFive = 5 * i;
            System.out.println("5 x " + i + " = " + multiplicationOfFive);
        } while (i <= 9);
    }
}

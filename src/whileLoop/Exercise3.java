package whileLoop;

public class Exercise3 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 9) {
            i++;
            int number = 7;
            int multiplicationOfSeven = number * i;
            System.out.println("7 x " + i + " = " + multiplicationOfSeven);
        }
    }
}

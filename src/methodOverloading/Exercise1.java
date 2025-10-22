package methodOverloading;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
    }

    // add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}

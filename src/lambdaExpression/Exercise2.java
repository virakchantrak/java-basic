package lambdaExpression;

public class Exercise2 {
    public static void main(String[] args) {
        Calculator sum = ((a, b) -> a + b);
        System.out.println(sum.add(5,5));
    }

    @FunctionalInterface
    interface Calculator {
        int add(int a, int b);
    }
}

package generics;

public class BoundedTypeParameter {
    public static void main(String[] args) {
        Calculator<Integer> calculator = new Calculator<>();
        double square = calculator.square(3);
        System.out.print(square);
    }
    public static class Calculator<T extends Number> {
        public double square(T num) {
            double value = num.doubleValue();
            return value * value;
        }
    }
}

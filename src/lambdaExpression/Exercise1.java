package lambdaExpression;

public class Exercise1 {
    public static void main(String[] args) {

        // Before Java 8
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };
        greeting.sayHello();

        // With Java 8 Lambda:
        Greeting greeting1 = () -> System.out.println("Helo");
        greeting1.sayHello();
    }
    interface Greeting {
        void sayHello();
    }
}

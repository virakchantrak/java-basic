package functionalInterface;

public class Exercise1 {
    public static void main(String[] args) {
        Name name = new Name() {
            @Override
            public void male(String name) {
                System.out.println("My name is " + name);
            }
        };
        name.male("Virak");
    }

    @FunctionalInterface
    interface Name {
        void male(String name);

        default void show() {
            System.out.println("Default method");
        }

        static void info() {
            System.out.println("Static method");
        }
    }
}

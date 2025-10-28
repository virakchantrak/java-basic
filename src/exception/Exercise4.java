package exception;

// throw keywords
public class Exercise4 {
    public static void main(String[] args) {
        int age = 19;
        if (age < 18) {
            throw  new ArithmeticException("Age is not valid to vote");
        } else {
            System.out.println("Welcome to vote");
        }


    }
}

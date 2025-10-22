package contructor;

/**
 * Default Constructor
 * If you don’t create a constructor, Java automatically provides one.
 */
public class DefaultConstructor {
    private String name;
    private int age;

    public static void main(String[] args) {
        DefaultConstructor defaultConstructor = new DefaultConstructor(); // default constructor is called
        System.out.println(defaultConstructor.name);
        System.out.println(defaultConstructor.age);
    }
}

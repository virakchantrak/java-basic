package contructor;

/**
 * Parameterized Constructor
 * You can define your own constructor with parameters to initialize object values.
 */
public class ParameterizedConstructor {
    private String name;
    private int age;

    ParameterizedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ParameterizedConstructor s1 = new ParameterizedConstructor("Virak", 22);
        ParameterizedConstructor s2 = new ParameterizedConstructor("Chantrak", 23);

        s1.display();
        s2.display();
    }
}

package anonymousClass;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ". Welcome!");
    }
}

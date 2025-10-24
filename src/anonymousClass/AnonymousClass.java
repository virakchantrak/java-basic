package anonymousClass;

public class AnonymousClass {
    public static void main(String[] args) {
        Person person = new Person("Alice") {
            @Override
            public void introduce() {
                System.out.println("Hi, I'm " + name + ". Welcome!");
            }
        };

        person.introduce();
    }
}

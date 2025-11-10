package methodReference;

// Constructor reference
public class Exercise2 {
    private String name;
    private int age;

    public Exercise2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
//        Service service = (n, a) -> new Exercise2(n, a);
        Service service = Exercise2::new;

        Exercise2 saved = service.save("Virak", 22);
        System.out.print(saved.getName() + " age is " + saved.getAge());
    }

    interface Service {
        Exercise2 save(String n, int age);
    }
}

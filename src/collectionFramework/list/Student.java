package collectionFramework.list;

class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}


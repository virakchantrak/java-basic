package oop.abstraction;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }

    void name() {
        System.out.println("Dog's name is: " + name);
    }

    void age() {
        System.out.println("Dog's age is: " + age);
    }
}

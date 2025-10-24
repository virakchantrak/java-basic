package oop.abstraction;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }

    void name() {
        System.out.println("Cat's name is: " + name);
    }

    void age() {
        System.out.println("Cat's age is: " + age);
    }
}

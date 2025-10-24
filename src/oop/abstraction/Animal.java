package oop.abstraction;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void name() {
        System.out.println("Animal's name is: " + name);
    }

    void age() {
        System.out.println("Animal's age is: " + age);
    }

    abstract void makeSound(); // abstract method (no body)

    void eat() { // concrete method
        System.out.println("This animal eats food.");
    }
}

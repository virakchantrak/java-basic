package oop.abstraction;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    void name() {
        System.out.println("Dog's name is: " + name);
    }

    abstract void makeSound(); // abstract method (no body)

    void eat() { // concrete method
        System.out.println("This animal eats food.");
    }
}

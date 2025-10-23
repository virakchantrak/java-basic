package oop.abstraction;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

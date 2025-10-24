package oop.polymorphism.methodOverriding;

public class Virak extends Person{

    public Virak(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am " + name + ", nice to meet you!");
    }
}

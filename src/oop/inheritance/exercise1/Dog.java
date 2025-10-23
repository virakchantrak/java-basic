package oop.inheritance.exercise1;

public class Dog extends Animal{
    void displayName() {
        System.out.println("Dog name is: " +  name);
    }

    // Method overriding
    @Override
    void showName() {
        System.out.println("Dog name is: " + name);
    }

    // Super keyword
    void eat() {
        super.eat();
        System.out.println("Dog can eat");
    }
}

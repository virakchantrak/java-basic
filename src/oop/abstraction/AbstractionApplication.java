package oop.abstraction;

public class AbstractionApplication {
    public static void main(String[] args) {
        String dogName = "Buddy";
        Animal dog = new Dog(dogName);
        dog.makeSound(); // Output: Woof, Woof
        dog.eat();       // Output: This animal eats food.
        dog.name();      // Output: Dog's name is: Buddy
    }
}

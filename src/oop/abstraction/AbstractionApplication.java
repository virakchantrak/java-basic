package oop.abstraction;

public class AbstractionApplication {
    public static void main(String[] args) {
        String dogName = "Buddy";
        int age = 5;
        Animal dog = new Dog(dogName, age);
        dog.makeSound(); // Output: Woof, Woof
        dog.eat();       // Output: This animal eats food.
        dog.name();      // Output: Dog's name is: Buddy

        String catName = "Whiskers";
        Animal cat = new Cat(catName, age);
        cat.makeSound(); // Output: Meow, Meow
        cat.eat();       // Output: This animal eats food.
        cat.name();      // Output: Cat's name is: Whiskers
    }
}

package oop.polymorphism;

import oop.polymorphism.methodOverriding.Person;
import oop.polymorphism.methodOverriding.Virak;

public class PolymorphismApplication {
    public static void main(String[] args) {
        // Method Overloading
        MethodOverloading mo = new MethodOverloading();
        System.out.println("Method Overloading:");
        System.out.println("Sum of 2 integers: " + mo.add(5, 10));
        System.out.println("Sum of 2 doubles: " + mo.add(5.5, 10.5));
        System.out.println("Sum of 3 integers: " + mo.add(5, 10, 15));

        // Method Overriding
        System.out.println("\nMethod Overriding:");
        Person person = new Virak("Virak");
        person.introduce();
    }
}

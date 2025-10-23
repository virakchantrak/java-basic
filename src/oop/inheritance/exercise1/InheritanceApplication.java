package oop.inheritance.exercise1;

public class InheritanceApplication {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.setName("Antre");
//        animal.showName();
        animal.eat();

        Dog dog = new Dog();
//        dog.setName("A Sor");
//        dog.showName();
        dog.eat();
    }
}

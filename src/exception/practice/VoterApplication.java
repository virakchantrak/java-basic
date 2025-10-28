package exception.practice;

import oop.inheritance.exercise3.Gender;

public class VoterApplication {
    public static void main(String[] args) {
        VoterService voterService = new VoterService();

        // Valid person
        try {
            Person person1 = new Person(1L, " Alice", Gender.FEMALE,
                    java.time.LocalDate.of(2990, 5, 15), "12345");
            voterService.register(person1);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to register person1: " + e.getMessage());
        }
        voterService.displayVoters();

    }
}

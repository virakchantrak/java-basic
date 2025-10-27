package collectionFramework.list;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n===== 🎓 Student Manager System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Remove Student");
            System.out.println("5. Sort Students by Age");
            System.out.println("6. Exit");
            System.out.print("👉 Enter your choice: ");
            choice = sc.next();
            sc.nextLine();

            switch (choice) {
                case "1" -> {
                    StudentService.register(sc, students);
                }

                case "2" -> {
                    StudentService.displayAll(students);
                }

                case "3" -> {
                    StudentService.searchByName(sc, students);
                }

                case "4" -> {
                    StudentService.removeByName(sc, students);
                }

                case "5" -> {
                    StudentService.sortByAge(students);
                }

                case "6" -> System.out.println("👋 Exiting... Goodbye, Virak!");

                default -> System.out.println("❌ Invalid choice. Try again!");
            }
        } while (!choice.equals("6"));
    }
}

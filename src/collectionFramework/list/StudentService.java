package collectionFramework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentService {

    public static void sortByAge(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("⚠️ No students to sort.");
        } else {
            Collections.sort(students, Comparator.comparing(Student::getAge));
            System.out.println("✅ Students sorted by age:");
            students.forEach(System.out::println);
        }
    }

    public static void displayAll(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("⚠️ No students found.");
        } else {
            System.out.println("\n👩‍🎓 Student List:");
            for (Student s : students) {
                System.out.println("• " + s);
            }
        }
    }

    public static void removeByName(Scanner sc, ArrayList<Student> students) {
        System.out.print("Enter name to remove: ");
        String name = sc.nextLine();
        boolean removed = students.removeIf(s -> s.getName().equalsIgnoreCase(name));

        if (removed) {
            System.out.println("🗑️ Student removed successfully!");
        } else {
            System.out.println("❌ No student found with that name.");
        }
    }

    public static void searchByName(Scanner sc, ArrayList<Student> students) {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        boolean found = false;

        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("✅ Found: " + s);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Student not found.");
        }
    }

    public static void register(Scanner sc, ArrayList<Student> students) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        students.add(new Student(name, age));
        System.out.println("✅ Student added successfully!");
    }
}

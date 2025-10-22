package oop.classAndObject;

import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of students: ");
        Student[] students = studentService.createStudents(scanner.nextInt());
        studentService.sortByName(students);
        studentService.print(students);
    }
}

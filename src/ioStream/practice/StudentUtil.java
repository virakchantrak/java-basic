package ioStream.practice;

import oop.inheritance.exercise3.Gender;

import java.util.Scanner;

public class StudentUtil {
    private static int counter = 0;
    public static Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Gender (MALE/FEMALE): ");
        String genderInput = scanner.nextLine().toUpperCase();
        System.out.println("Enter Student Grade: ");
        Integer grade = Integer.parseInt(scanner.nextLine());
        int id = ++counter;
        return new Student((long) id, name, Gender.valueOf(genderInput), grade);
    }
}

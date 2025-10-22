package oop.classAndObject;

import java.util.Scanner;

public class StudentService {
    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Name: ");
        student.setName(scanner.next());
        System.out.println("Gender: ");
        student.setGender(scanner.next());
        System.out.println("Age: ");
        student.setAge(scanner.nextInt());

        return student;
    }

    public Student[] createStudents(int n) {
        Student[] students = new Student[n];

        for(int i = 0; i < students.length; i++) {
            System.out.println("Student: " + (i + 1));
            students[i] = createStudent();
        }
        return students;
    }

    public void print(Student[] students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public void sortByName(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if(students[i].getName().compareTo(students[j].getName()) > 0) {
                    Student stu = students[i];
                    students[i] = students[j];
                    students[j] = stu;
                }
            }
        }
    }
}

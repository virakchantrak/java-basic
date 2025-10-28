package ioStream.practice;

import java.util.List;

public class StudentApplication {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

//        int numberOfStudents = 2;
//        for (int i = 0; i < numberOfStudents; i++) {
//            Student student = StudentUtil.createStudent();
//            studentService.createStudent(student);
//        }

        List<Student> studentList = studentService.getAllStudents();
        for (Student student : studentList) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Gender: " + student.getGender());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("-----------------------");
        }

    }
}

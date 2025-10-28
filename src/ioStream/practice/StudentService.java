package ioStream.practice;

import oop.inheritance.exercise3.Gender;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public void createStudent(Student student) {
        FileUtil.saveToFile(student.toData());
    }

    public List<Student> getAllStudents() {
        List<String> stringList = FileUtil.readFromFile();
        List<Student> studentList = new ArrayList<>();
        for (String text : stringList) {
            String[] data = text.split(", ");
            Long id = Long.parseLong(data[0]);
            String name = data[1];
            Gender gender = Gender.valueOf(data[2]);
            Integer grade = Integer.parseInt(data[3]);
            Student student = new Student(id, name, gender, grade);
            studentList.add(student);
        }
        return studentList;
    }
}

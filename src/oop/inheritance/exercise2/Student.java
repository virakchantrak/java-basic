package oop.inheritance.exercise2;

public class Student extends Person{
    private int grade;

    public Student(String name, String gender, int age) {
        super(name, gender, age);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

package oop.inheritance.exercise2;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, String gender, int age) {
        super(name, gender, age);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

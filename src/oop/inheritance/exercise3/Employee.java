package oop.inheritance.exercise3;

public class Employee {
    private int id;
    private String name;
    private Gender gender;
    private double salary;
    private EmployeeType employeeType;

    private static int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Employee(String name, Gender gender, double salary, EmployeeType employeeType) {
        count++;
        this.id = count;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.employeeType = employeeType;
    }
}

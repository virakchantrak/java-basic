package ioStream.practice;

import oop.inheritance.exercise3.Gender;

public class Student {
    private Long id;
    private String name;
    private Gender gender;
    private Integer grade;

    public Student(Long id, String name, Gender gender, Integer grade) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    public String toData() {
        return id + ", " + name + ", " + gender + ", " + grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}

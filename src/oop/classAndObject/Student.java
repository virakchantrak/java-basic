package oop.classAndObject;

public class Student {
    private String name;
    private String gender;
    private int age;

    public String toString() {
        return "Name: " + name + ", " + "Gender: " + gender + ", " + "Age: " + age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    public void setAge (int age) {
        if (age != 0) {
            this.age = age;
        } else {
            System.out.println("Age can not less than zero");
        }
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}

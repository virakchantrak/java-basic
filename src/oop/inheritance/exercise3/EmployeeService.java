package oop.inheritance.exercise3;

import java.util.Scanner;

public class EmployeeService {

    public Employee[] createEmployees(int n) {
       Employee[] employees = new Employee[n];
       for (int i = 0; i < employees.length; i++) {
           System.out.println("Employee: " + (i + 1));
           employees[i] = createEmployee();
       }

       return employees;
    }

    public void calculateBonus( Employee[] employees) {
        double totalBonus = 0;
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            double bonus = 0;
            switch (employee.getEmployeeType()) {
                case FULL_TIME:
                    bonus = employee.getSalary() * 0.10;
                    break;
                case PART_TIME:
                    bonus = employee.getSalary() * 0.05;
                    break;
                case INTERNSHIP:
                    bonus = employee.getSalary() * 0.02;
                    break;
            }
            totalSalary += employee.getSalary();

            totalBonus += bonus;
            System.out.println("Bonus for Employee ID " + employee.getId() + ": " + bonus);
        }
        System.out.println("Total Bonus for all Employees: " + totalBonus);
        System.out.println("Total Salary for all Employees: " + totalSalary);
    }
    public void employeeCount(Employee[] employees) {
        int countFemale = 0;
        int countMale = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getGender() == Gender.FEMALE) {
                countFemale++;
            } else if (employee.getGender() == Gender.MALE) {
                countMale++;
            }
        }
        System.out.println("Total Female Employees: " + countFemale);
        System.out.println("Total Male Employees: " + countMale);
    }


    public void print(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Gender: " + employee.getGender());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Employee Type: " + employee.getEmployeeType());
            System.out.println("-----------------------------");
        }
    }

    public Employee createEmployee() {
        String name = getString("Name: ");
        Gender gender = getGender("Gender: ");
        double salary = getDouble("Salary: ");
        EmployeeType employeeType = getEmployeeType("Employee type: ");

        return new Employee(name, gender, salary, employeeType);
    }

    public static Gender getGender(String label) {
        System.out.println(label);
        Scanner scanner = new Scanner(System.in);
        return Gender.valueOf(scanner.next().toUpperCase());
    }

    public static EmployeeType getEmployeeType(String label) {
        System.out.println(label);
        Scanner scanner = new Scanner(System.in);
        return EmployeeType.valueOf(scanner.next().toUpperCase());
    }

    public static String getString(String label) {
        System.out.println(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.next().toUpperCase();
    }

    public static double getDouble(String label) {
        return Double.parseDouble(getString(label));
    }
}

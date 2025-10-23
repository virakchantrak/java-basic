package oop.inheritance.exercise3;

import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees to create: ");
        int numberOfEmployees = scanner.nextInt();
        if (numberOfEmployees <= 0) {
            System.out.println("Please enter a valid number of employees.");
            return;
        }
        Employee[] employees = employeeService.createEmployees(numberOfEmployees);
        employeeService.print(employees);
        employeeService.employeeCount(employees);
        employeeService.calculateBonus(employees);

    }
}

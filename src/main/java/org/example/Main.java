package org.example;

import org.example.Employee;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", "Developer"),
                new Employee(102, "Bob", "Tester"),
                new Employee(101, "Alice", "Developer"),
                new Employee(103, "Charlie", "Manager"),
                new Employee(102, "Bob", "Tester")
        );

        List<Employee> uniqueEmployees = EmployeeManager.removeDuplicates(employees);

        for (Employee emp : uniqueEmployees) {
            System.out.println(emp);
        }
    }
}

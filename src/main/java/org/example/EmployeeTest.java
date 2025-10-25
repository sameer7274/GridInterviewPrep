package org.example;

import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        testNoDuplicates();
        testWithDuplicates();
        testEmptyList();
        testAllDuplicates();

        System.out.println("✅ All test cases passed.");
    }

    static void testNoDuplicates() {
        List<Employee> input = Arrays.asList(
                new Employee(1, "Alice", "Dev"),
                new Employee(2, "Bob", "Tester"),
                new Employee(3, "Charlie", "Manager")
        );
        List<Employee> result = EmployeeManager.removeDuplicates(input);
        assert result.size() == 3 : "Failed testNoDuplicates";
    }

    static void testWithDuplicates() {
        List<Employee> input = Arrays.asList(
                new Employee(1, "Alice", "Dev"),
                new Employee(2, "Bob", "Tester"),
                new Employee(1, "Alice", "Dev")
        );
        List<Employee> result = EmployeeManager.removeDuplicates(input);
        assert result.size() == 2 : "Failed testWithDuplicates";
        assert result.get(0).id == 1 && result.get(1).id == 2;
    }

    static void testEmptyList() {
        List<Employee> input = new ArrayList<>();
        List<Employee> result = EmployeeManager.removeDuplicates(input);
        assert result.isEmpty() : "Failed testEmptyList";
    }

    static void testAllDuplicates() {
        List<Employee> input = Arrays.asList(
                new Employee(5, "X", "Dev"),
                new Employee(5, "X", "Dev"),
                new Employee(5, "X", "Dev")
        );
        List<Employee> result = EmployeeManager.removeDuplicates(input);
        assert result.size() == 1 : "Failed testAllDuplicates";
    }
}

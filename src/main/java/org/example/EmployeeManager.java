package org.example;

import java.util.*;

public class EmployeeManager {
    public static List<Employee> removeDuplicates(List<Employee> employees) {
        Set<Integer> seenIds = new HashSet<>();
        List<Employee> result = new ArrayList<>();

        for (Employee emp : employees) {
            if (!seenIds.contains(emp.id)) {
                seenIds.add(emp.id);
                result.add(emp);
            }
        }

        return result;
    }
}


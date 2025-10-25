package org.example;

import java.util.Objects;

public class Employee {
    int id;
    String name;
    String designation;

    public Employee(int id,String name,String designation) {
        this.id = id;
        this.name=name;
        this.designation=designation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

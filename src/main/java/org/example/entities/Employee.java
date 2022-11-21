package org.example.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
//        return salary.compareTo(other.getSalary());
    }

    @Override
    public String toString() {
        return "Name: " + name+
                ", salary: " + String.format("%.2f" ,salary);
    }
}

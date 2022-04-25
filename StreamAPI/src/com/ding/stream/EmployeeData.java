package com.ding.stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1001, "AA", 24));
        employees.add(new Employee(1002, "CC", 34));
        employees.add(new Employee(1003, "BB", 22));
        employees.add(new Employee(1004, "DD", 26));
        employees.add(new Employee(1005, "FF", 44));

        return employees;
    }
}

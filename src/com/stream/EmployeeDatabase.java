package com.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

    public static List<Employee> getEmployees() {
        return Stream.of(new Employee("100", "John", "DEV", 25000),
                new Employee("100", "John", "DEV", 25000),
                new Employee("101", "Kumar", "QA", 25000),
                new Employee("102", "Rakesh", "Admin", 20000),
                new Employee("103", "Vinoth", "SE", 30000),
                new Employee("104", "Nancy", "DEV", 25000),
                new Employee("105", "John", "DEV", 35000),
                new Employee("106", "Rajini", "PM", 45000),
                new Employee("107", "Vijay", "PD", 45000),
                new Employee("108", "Ajith", "SE", 40000),
                new Employee("109", "Rakesh", "DEV", 35000),
                new Employee("110", "Kamal", "PM", 45000))
                .collect(Collectors.toList());
    }
}

package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {

//        List<Employee> employees = EmployeeDatabase.getEmployees();
//        for (Employee employee: employees) {
//           if (employee.getSalary() > 30000) {
//               System.out.println("employee = " + employee);
//           }
//        }

        List<List<String>> table = List.of(List.of("A", "B"), List.of("3", "4"));
        String[][] finalData = table.stream()
                .map(arr -> arr.toArray(String[]::new))
                .toArray(String[][]::new);

        System.out.println(Arrays.deepToString(finalData));



//        List<String> nameList = EmployeeDatabase.getEmployees()
//                .stream()
//                .filter(employee -> employee.getSalary() > 30000)
//                .map(employee -> employee.getName())
//                .distinct()
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println("nameList = " + nameList);
    }
}

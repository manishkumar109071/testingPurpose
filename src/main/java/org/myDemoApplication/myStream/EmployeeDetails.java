package org.myDemoApplication.myStream;

import java.util.List;

public class EmployeeDetails {
    public static List<Employee> getEmployee() {
        Employee employee = new Employee();
        List<Employee> employeeList = List.of(new Employee("Manish", "Java", 25000),
                new Employee("Kedar", "IT", 22000),
                new Employee("Jayant", "Java", 23000),
                new Employee("Jugal", ".NET", 21000));
        return employeeList;
    }


}

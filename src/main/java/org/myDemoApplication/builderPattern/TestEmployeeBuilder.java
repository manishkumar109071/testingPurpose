package org.myDemoApplication.builderPattern;

public class TestEmployeeBuilder {

    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder=new EmployeeBuilder();
        Employee employee = employeeBuilder.name("manish").age(21).build();
        System.out.println(employee);
    }
}

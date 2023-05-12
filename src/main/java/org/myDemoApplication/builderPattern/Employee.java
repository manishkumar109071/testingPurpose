package org.myDemoApplication.builderPattern;

import lombok.Getter;

@Getter
public class Employee {
    private String name;
    private String mobileNumber;
    private int age;
    private String address;

    Employee(EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.getName();
        this.mobileNumber = employeeBuilder.getMobileNumber();
        this.age = employeeBuilder.getAge();
        this.address = employeeBuilder.getAddress();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

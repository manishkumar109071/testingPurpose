package org.myDemoApplication.builderPattern;

import lombok.Getter;

@Getter
public class EmployeeBuilder {
    private String name;
    private String mobileNumber;
    private int age;
    private String address;

    EmployeeBuilder name(String name){
        this.name=name;
        return this;
    }
    EmployeeBuilder mobileNumber(String mobileNumber){
        this.mobileNumber=mobileNumber;
        return this;
    }
    EmployeeBuilder address(String address){
        this.address=address;
        return this;
    }
    EmployeeBuilder age(int age){
        this.age=age;
        return this;
    }

    Employee build (){
        Employee employee=new Employee(this);
        return employee;
    }
}

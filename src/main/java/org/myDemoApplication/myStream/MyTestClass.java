package org.myDemoApplication.myStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyTestClass {
    public static void main(String[] args){
        List<Integer> stringList =List.of(23,34,12,9,56,76,43);
        Optional<Integer> salary= stringList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(salary);

        Employee employee=new Employee();
        employee.getDepartment();

        List<Employee> employeeList=EmployeeDetails.getEmployee();
        System.out.println(employeeList);
        Map<String, Long> emp= employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        Optional<Integer> empp= employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())

                .map(Employee::getSalary).skip(1).findFirst();
empp.ifPresent(x->{System.out.println("-----"+x);});
 Map<String, Long> dd =employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

 System.out.println(dd);


    }

}

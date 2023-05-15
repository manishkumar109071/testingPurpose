package org.myDemoApplication.interview;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class InterviewQuestion {

    public static void main(String[] args) {


        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Kedar", "JAVA", 26000));
        employeeList.add(new Employee("manju", ".NET", 24000));
        employeeList.add(new Employee("Manish", ".NET", 24000));
        employeeList.add(new Employee("Jayant", ".NET", 24000));
        employeeList.add(new Employee("Jugal", ".NET", 24000));

        //second hieghtest salary

        Integer secondHieghtestSalary = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getSalary).skip(1).findFirst().get();
        System.out.println(secondHieghtestSalary);

        //convert List to Map
        Map<String, Integer> employeeMap = employeeList.stream().collect(Collectors.toMap(x -> x.getName(), x -> x.getSalary()));
        //System.out.println(employeeMap);
        //groupBy in list
        Map<String, Long> employeeMap2 = employeeList.stream().collect(Collectors.groupingBy(x -> x.getDepartment(), Collectors.counting()));
        System.out.println(employeeMap2);

        //Sorting multiple

        Comparator<Employee> byName = Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary);
        Collections.sort(employeeList, byName);
        System.out.println(employeeList);
    }



    }

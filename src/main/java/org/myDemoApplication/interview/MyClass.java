package org.myDemoApplication.interview;

import java.util.*;
import java.util.stream.Collectors;

public class MyClass {
    public static void main(String[] args) {

        Map<String,Integer> hasMap=new HashMap<>();
        hasMap.put("One", 1);
        hasMap.put("Four", 4);
        hasMap.put("Two", 2);
        hasMap.put("five", 5);
        hasMap.put("Three", 3);

        List<Integer> numberList =List.of(23,34,12,9,56,76,43);
        List<Employee> employeeList=List.of(new Employee("manish","JAVA", 25000),
                new Employee("manish","JAVA", 26000),
                new Employee("Kedar",".NET", 24000),
                new Employee("Jugal","JAVA", 22000),
                new Employee("Jayant",".NET", 23000));

        //Sorting list of object
        List<String> emp1= employeeList.stream()
                .map(x-> x.getName().toUpperCase())
                .collect(Collectors.toList());
        Optional<Integer> maxSalary= employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getSalary)
                .skip(1).findFirst();

        System.out.println(maxSalary);

        //Sorting Integer List
        Integer secondMaxNumber = numberList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondMaxNumber);

        //Sorting Map
        Map<String, Integer> sortedMap= hasMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e,e1)-> e1, LinkedHashMap::new));
            System.out.println(sortedMap);

    }
}

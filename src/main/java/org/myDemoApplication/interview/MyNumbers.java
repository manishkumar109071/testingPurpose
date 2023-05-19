package org.myDemoApplication.interview;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MyNumbers {
    public static void main(String[] args) {
        List<Integer> numberList=List.of(2,4,3,8,2,1,10);
        Integer maxNumber =numberList.stream()
                .mapToInt(x-> x)
                .max()
                .getAsInt();
        Integer minNumber =numberList.stream().mapToInt(x-> x).min().getAsInt();
        Integer sumOfNumber=  numberList.stream().mapToInt(x-> x).sum();

        //numberList.stream().max(Comparator.comparing(Integer::valueOf)).get();

        int sumOfCube = numberList.stream().mapToInt(x-> x*x).sum();
        List<Integer> distinctList = numberList.stream().distinct().collect(Collectors.toList());

        Set<Integer> set =numberList.stream().collect(Collectors.toSet());
        Map<Object, Long> map= numberList.stream()
                        .collect(Collectors.groupingBy(x-> x,Collectors.counting()));


        System.out.println("max no in the list "+numberList+" is : "+maxNumber);
        System.out.println("min no in the list "+numberList+" is : "+minNumber);
        System.out.println("Sum :"+sumOfNumber);
        System.out.println(sumOfCube);
        System.out.println(distinctList);
        System.out.println(set);
    }
}

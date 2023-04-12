package org.myDemoApplication.streamRelated;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamsClass {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 3, 7);
        System.out.println("----OriginalList-----");

        numberList.forEach(l -> {
            System.out.print("  " + l);
        });

        System.out.println("\n----Unique Element----");

        numberList.stream().distinct().collect(Collectors.toList()).forEach(l -> {
            System.out.print("  " + l);
        });

        System.out.println("\n----Unique Element----");

        numberList.stream().distinct().filter(l -> l >= 3).collect(Collectors.toList()).forEach(l2 -> {
            System.out.println(" " + l2);
        });

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        numbers.stream().map(n -> n * n).forEach(System.out::println);

        System.out.println(">>>"+numbers.stream().distinct().mapToInt(n -> n * n).sum());

        System.out.println(numbers.stream().distinct().count());


        System.out.println("Second Highest Number in the list" + numberList);
        Integer highestNumber = numberList.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();

        System.out.println(highestNumber);

    }

}

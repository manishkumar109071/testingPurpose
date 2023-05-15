package org.myDemoApplication.interview;

import java.util.*;
import java.util.stream.Collectors;

public class StringManipulation {

    public static void main(String[] args) {
        String str="abcefgabcdefghabcjijk";
        // program to find how many times abc comes in thr given String
        long wordCount = Arrays.asList(str.replaceAll("a", " a")
                .replaceAll("c","c ")
                .split(" ")).stream().filter(x->x.equalsIgnoreCase("abc"))
                .count();
        System.out.println("abc comes in the given String "+str+" for "+wordCount+" times");

        Map<Character, Long> characterLongMap =str.chars().mapToObj(ch-> (char)ch)
                .collect(Collectors.groupingBy(ch->  ch, Collectors.counting()));
        System.out.println(characterLongMap);

        // flat map example
        List<Integer> list1=List.of(1,3,4,5);
        List<Integer> list2=List.of(6,7,8,9);
        List<List<Integer>> finalList=List.of(list1,list2);
        List<Integer> flatList = finalList.stream()
                .flatMap(x-> x.stream())
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(flatList);


    }
}

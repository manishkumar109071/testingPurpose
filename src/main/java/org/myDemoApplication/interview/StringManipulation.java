package org.myDemoApplication.interview;

import java.util.Arrays;
import java.util.Map;
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
    }
}

package org.myDemoApplication.myInterviewQuestion;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MyInterviewQuestion {
    public String reverseString(String str) {
        String reverseString = "";
        for (int i = 0; i < str.length(); i++) {
            reverseString = str.charAt(i) + reverseString;
        }
        return reverseString;
    }

    public int reverseNumber(int num) {
        int reverseNumber = 0;
        while (num > 0) {
            reverseNumber = reverseNumber * 10 + num % 10;
            num = num / 10;
        }
        return reverseNumber;
    }

    int recursionAdd(int number) {
        if (number > 0) {
            return number + recursionAdd(number - 1);
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        MyInterviewQuestion myInterviewQuestion = new MyInterviewQuestion();
        System.out.println(myInterviewQuestion.reverseString("manish kumar"));
        System.out.println(myInterviewQuestion.reverseNumber(54321));
        System.out.println(myInterviewQuestion.recursionAdd(10));

        String str= "abcdefabcghiabc";
        long wordCount = Arrays.asList(str.replaceAll("a", " a")
                        .replaceAll("c","c ")
                        .split(" "))
                .stream()
                .filter(x->x.equalsIgnoreCase("abc"))
                .count();
        System.out.println(wordCount);

        Map<Character, Long> map= str.chars().mapToObj(ch-> (char) ch)
                .collect(Collectors.groupingBy(ch-> ch, Collectors.counting()));

        System.out.println(map);


    }
}

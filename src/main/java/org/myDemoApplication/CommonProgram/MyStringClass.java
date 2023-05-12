package org.myDemoApplication.CommonProgram;

import java.util.Optional;

public class MyStringClass {
    public static void main(String[] args) {
        String s1="manish";
        String s2="manish";
        String s3=new String("manish");
        String s4=new String("manish");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        System.out.println(s1.equals(s3));

        Optional<String> ss= Optional.ofNullable("null");

        ss.ifPresent(name -> System.out.println(name.length()));


    }
}

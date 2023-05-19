package org.myDemoApplication.CommonProgram;

public class ReverseString {
    public String reverseString(String str) {
        String revString = "";
        for (int k = 0; k < str.length(); k++) {
            revString = str.charAt(k)+ revString;
        }
        System.out.println(revString);
        return revString;
    }



    public static void main(String[] args) {

        String name="manish kumar";
        int i=name.length();
        while(i>0)
            System.out.print(name.charAt(i-1));
            i--;
        }
    }


package org.myDemoApplication.CommonProgram;

public class ReverseString {
    public String reverseString(String str) {
        String revString = "";
        for (int k = 0; k < str.length(); k++) {
            revString = str.charAt(k) + revString;
        }
        System.out.println(revString);
        return revString;
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("Manish Kumar");
    }
}

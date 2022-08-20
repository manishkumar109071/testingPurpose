package org.myDemoApplication.CommonProgram;

public class ReverseNumber {
    public int reverseNumber(int num){
        int reverseNumber=0;
        while(num>0){
            reverseNumber=reverseNumber*10+num%10;
            num=num/10;
        }
        System.out.println(reverseNumber);
        return reverseNumber;
    }
    public static void main(String[] args) {
        ReverseNumber reverseNumber=new ReverseNumber();
        reverseNumber.reverseNumber(1234);

    }
}

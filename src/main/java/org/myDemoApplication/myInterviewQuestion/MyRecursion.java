package org.myDemoApplication.myInterviewQuestion;

public class MyRecursion {

    String reverse(String str){

        if(str.length()>0){
            return reverse(str.substring(0,str.length()-1));
        }else{
            return "";
        }
    }

    public static void main(String[] args) {
        MyRecursion myRecursion=new MyRecursion();
        System.out.println(myRecursion.reverse("hello"));
    }
}

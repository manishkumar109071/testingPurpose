package org.myDemoApplication.interview;

public class EvenOddNumber {


    public static void main(String[] args) {

        EvenNumberClass evenNumberClass=new EvenNumberClass();
        OddNumberClass oddNumberClass=new OddNumberClass();
        Thread t1=new Thread(evenNumberClass);
        Thread t2=new Thread(oddNumberClass);

        t1.start();
        t1.setName("even");
        t2.start();
        t2.setName("odd");

    }
}

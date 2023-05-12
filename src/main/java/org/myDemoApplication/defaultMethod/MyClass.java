package org.myDemoApplication.defaultMethod;

public class MyClass implements MyInterface{
    @Override
    public void show() {
        System.out.println("Hello*****");
    }

    public static void main(String[] args) {
        MyInterface my = new MyClass();
        my.manish();
    }
}

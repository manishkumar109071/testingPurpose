package org.myDemoApplication.defaultMethod;

public interface MyInterface {

    public void show();
    default void manish(){
        System.out.println("Default Method---------");
    }

}

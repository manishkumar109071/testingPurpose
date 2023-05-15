package org.myDemoApplication.interview;

import java.util.concurrent.locks.Lock;

public class EvenNumberClass implements Runnable {

    static Object lock=new Object();

    public int counter = 1;

    @Override
    public void run() {
        while (counter < 10) {
            synchronized (lock) {
                while (counter % 2 == 0) {
                    try {
                        lock.wait(10);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"  "+ counter);
                counter++;
                lock.notifyAll();
            }

        }
    }
}

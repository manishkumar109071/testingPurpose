package org.myDemoApplication.primeandReverse;

import java.util.ArrayList;
import java.util.List;

public class MyPrimeNumber {
    boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MyPrimeNumber primeNumber = new MyPrimeNumber();
        List<Integer> primeNumberList = new ArrayList<>();
        List<Integer> nonPrimeNumberList = new ArrayList<>();

        for (int k = 0; k < 100; k++) {
            if (primeNumber.isPrime(k)) {
                primeNumberList.add(k);
            } else {
                nonPrimeNumberList.add(k);
            }
        }
        System.out.println("Prime: " + primeNumberList);
        System.out.println("Non-Prime: " + nonPrimeNumberList);

    }
}

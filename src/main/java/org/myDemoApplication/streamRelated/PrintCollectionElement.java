package org.myDemoApplication.streamRelated;

import java.util.*;

public class PrintCollectionElement {
    public static void printListElement() {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(12, 9, 45, 24, 8));
        numberList.forEach(x -> {
            System.out.println(x);
        });
    }

    public static void printMapElement() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Manish");
        map.put(2, "Manju");
        map.put(3, "Pihu");
        map.forEach((x, y) -> {
            System.out.println(x + "--" + y);
        });
        map.entrySet().stream().forEach(x -> {
            System.out.println(x.getKey() + "--" + x.getValue());
        });

    }

    public static void main(String[] args) {
        PrintCollectionElement.printListElement();
        PrintCollectionElement.printMapElement();
    }
}

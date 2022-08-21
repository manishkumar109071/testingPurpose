package org.myDemoApplication.streamRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheList {

    public static void sortListAccendingOrder(){
        List<Integer> numberList = new ArrayList<>(Arrays.asList(23, 15, 7, 9, 12));
        List<Integer> naturalOrder=numberList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(naturalOrder);
    }
    public static void sortListReverseOrder(){
        List<Integer> numberList = new ArrayList<>(Arrays.asList(23, 15, 7, 9, 12));
        List<Integer> reverseOrder=numberList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrder);
    }

    public static void main(String[] args) {
        SortTheList.sortListAccendingOrder();
        SortTheList.sortListReverseOrder();
    }

}

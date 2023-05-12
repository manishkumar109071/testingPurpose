package org.myDemoApplication;

import org.myDemoApplication.entity.MyEmployee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Manish!");


        List<MyEmployee> myEmployees = List.of(new MyEmployee("manish", "25000", 1),
                new MyEmployee("Ramesh", "40000", 2)
        );

        Map<Integer, List<MyEmployee>> employeeList= myEmployees
                .stream()
                .collect(Collectors.groupingBy(MyEmployee::getEmpId));

        Map<Integer, String> zz= myEmployees.stream().collect(Collectors.toMap(x-> x.getEmpId(), x-> x.getName()));

        System.out.println(""+zz);

        String str="manishkumar";
        Map < Character, Long > xx= str.chars().mapToObj(ch-> (char) ch).collect(Collectors.groupingBy(c-> c, Collectors.counting()));
        xx.forEach((k,v)-> {
            if(v==1){
                System.out.println(k+"--------"+v);
            }
        });
        System.out.println(xx);

    }

}



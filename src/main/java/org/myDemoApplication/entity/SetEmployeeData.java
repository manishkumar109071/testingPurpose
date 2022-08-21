package org.myDemoApplication.entity;

import java.util.List;

public class SetEmployeeData {
    public static List<EmployeeDetails> getEmployeeDetails() {

        List<EmployeeDetails> emplist = List.of(
                new EmployeeDetails(1001, "Manish", "Kumar", "manish@gmail.com", "DC-01", "JAVA", "18-02-2020", 35000L),
                new EmployeeDetails(1002, "Madhur", "Bhandarkar", "madhur@gmail.com", "DC-01", "ERP", "12-02-2010", 45000L),
                new EmployeeDetails(1003, "Sunil", "Dutt", "sunil@gmail.com", "DC-09", "React", "18-02-2009", 32000L),
                new EmployeeDetails(1004, "Kedar", "Jadhav", "kedar@gmail.com", "DC-08", "Angular", "18-02-2002", 56000L),
                new EmployeeDetails(1005, "Yashwant", "Kushwaha", "jashwant@gmail.com", "DC-07", "ERP", "18-02-2000", 25000L),
                new EmployeeDetails(1006, "Yuvaraj", "Banarse", "yovaraj@gmail.com", "DC-05", "ERP", "18-02-2011", 33000L),
                new EmployeeDetails(1007, "Ashish", "Bandi", "ashish@gmail.com", "DC-01", "Angular", "18-02-2001", 40000L),
                new EmployeeDetails(1008, "Mohit", "Saxena", "mohit@gmail.com", "DC-01", "JAVA", "18-02-2021", 15000L),
                new EmployeeDetails(1009, "Naveen", "Gupta", "naveen@gmail.com", "DC-05", "Oracle", "18-02-2014", 22000L),
                new EmployeeDetails(1010, "Neelkant", "Tripathi", "neelkant@gmail.com", "DC-09", "JAVA", "18-02-2017", 21000L)

        );
        return emplist;
    }
}

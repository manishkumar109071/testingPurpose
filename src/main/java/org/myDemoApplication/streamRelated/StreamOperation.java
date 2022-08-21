package org.myDemoApplication.streamRelated;

import org.myDemoApplication.entity.EmployeeDetails;
import org.myDemoApplication.entity.SetEmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {
    public static List<EmployeeDetails> sortByEmployeeSalary(List<EmployeeDetails> employeeDetailsList) {
        List<EmployeeDetails> sortedByEmpSalary = employeeDetailsList.stream().sorted(Comparator.comparing(EmployeeDetails::getSalary)).collect(Collectors.toList());
        return sortedByEmpSalary;
    }

    public static void main(String[] args) {
        SetEmployeeData employeeData = new SetEmployeeData();
        List<EmployeeDetails> employeeDetailsList=employeeData.getEmployeeDetails();
        StreamOperation.sortByEmployeeSalary(employeeDetailsList).forEach(x -> {
            System.out.println(x);
        });
    }
}

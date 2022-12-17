package org.myDemoApplication.streamRelated;

import org.myDemoApplication.entity.EmployeeDetails;
import org.myDemoApplication.entity.SetEmployeeData;

import java.util.Comparator;
import java.util.List;

public class CalculateSecondHighestSalary {
    public static EmployeeDetails getSecondHighlightedSalariedEmployee(List<EmployeeDetails> employeeDetailsList) {
        return employeeDetailsList.stream().
                sorted(Comparator.comparing(EmployeeDetails::getSalary).reversed()).skip(1).findFirst().get();
    }

    public static void main(String[] args) {
        String ANSI_RESET = "\u001B[43m";
        EmployeeDetails employeeDetails = CalculateSecondHighestSalary.getSecondHighlightedSalariedEmployee(SetEmployeeData.getEmployeeDetails());
        System.out.println(ANSI_RESET + "Second Highest Salaried Employee:\n" + employeeDetails);

    }
}

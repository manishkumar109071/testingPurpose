package org.myDemoApplication.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Setter
@Getter
@ToString
public class EmployeeDetailsResponse {
    List<EmployeeDetails> employeeDetailsList;
}

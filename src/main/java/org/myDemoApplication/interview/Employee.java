package org.myDemoApplication.interview;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {
    private String name;
    private String department;
    private Integer salary;

}

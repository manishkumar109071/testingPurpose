package org.myDemoApplication.utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.myDemoApplication.entity.EmployeeDetails;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadMockJsonData {
    public static Object readMockData() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        List<EmployeeDetails> employeeDetails= Collections.singletonList(objectMapper.readValue(Paths.get("/resources/MockData/EmployeeDetails.json").toFile(), EmployeeDetails.class));


        employeeDetails.stream().forEach(x->{
                System.out.println(x.getFirstName());
            });


        return employeeDetails;
    }

    public static void main(String[] args) throws IOException {
        ReadMockJsonData.readMockData();
    }
}

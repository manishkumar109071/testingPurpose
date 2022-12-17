package org.myDemoApplication.utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.myDemoApplication.entity.EmployeeDetails;
import org.myDemoApplication.entity.EmployeeDetailsResponse;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadMockJsonData {
    public static Object readMockData() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        //List<EmployeeDetails> employeeDetails= Collections.singletonList(objectMapper.readValue(Paths.get("EmployeeDetails.json").toFile(), EmployeeDetails.class));
        EmployeeDetailsResponse employeeDetails=objectMapper.readValue(new File("src/main/resources/MockData/EmployeeDetails.json"), EmployeeDetailsResponse.class);




        return employeeDetails;
    }

    public static void main(String[] args) throws IOException {
        ReadMockJsonData.readMockData();
    }
}

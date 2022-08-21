package org.myDemoApplication.entity;


public class EmployeeDetails {
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String departmentId;
    private String technology;
    private String dateOfJoining;
    private Long salary;

    public EmployeeDetails() {
    }

    public EmployeeDetails(Integer employeeId, String firstName, String lastName, String emailAddress, String departmentId, String technology, String dateOfJoining, Long salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.departmentId = departmentId;
        this.technology = technology;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", technology='" + technology + '\'' +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                ", salary=" + salary +
                '}';
    }
}

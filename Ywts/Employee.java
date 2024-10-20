package Ywts;

import java.io.Serializable;

public class Employee implements Serializable {
    String employeeName;
    int salary;
    String employeeId;

    @Override
    public String toString() {
        return employeeName + " " + salary + " " + employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(String employeeName, int salary, String employeeId) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeId = employeeId;
    }
}

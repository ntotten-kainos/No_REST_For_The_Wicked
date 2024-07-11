package org.example.models;

public class DeliveryEmployeeResponse {
    private String employeeName;
    private double employeeSalary;
    private String employeeBankAccountNumber;
    private String employeeNationalInsuranceNumber;

    public DeliveryEmployeeResponse(
            final String employeeName,
            final double employeeSalary,
            final String employeeBankAccountNumber,
            final String employeeNationalInsuranceNumber) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeBankAccountNumber = employeeBankAccountNumber;
        this.employeeNationalInsuranceNumber = employeeNationalInsuranceNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeBankAccountNumber() {
        return employeeBankAccountNumber;
    }

    public void setEmployeeBankAccountNumber(String employeeBankAccountNumber) {
        this.employeeBankAccountNumber = employeeBankAccountNumber;
    }

    public String getEmployeeNationalInsuranceNumber() {
        return employeeNationalInsuranceNumber;
    }

    public void setEmployeeNationalInsuranceNumber(
            String employeeNationalInsuranceNumber) {
        this.employeeNationalInsuranceNumber = employeeNationalInsuranceNumber;
    }
}

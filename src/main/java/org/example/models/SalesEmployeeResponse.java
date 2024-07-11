package org.example.models;

public class SalesEmployeeResponse {
    private String name;
    private String nationalInsurance;
    private int bankAccountNo;
    private double salary;
    private double commissionRate;

    public SalesEmployeeResponse(
            final String name,
            final String nationalInsurance,
            final int bankAccountNo,
            final double salary,
            final double commissionRate) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.bankAccountNo = bankAccountNo;
        this.salary = salary;
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(int bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public void setNationalInsurance(String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package org.example.models;

public class DeliveryEmployeeResponse {
    private String name;
    private String NINO;
    private int bankAccountNo;
    private double salary;

    public DeliveryEmployeeResponse(
            final String name,
            final String NINO,
            final int bankAccountNo,
            final double salary) {
        this.name = name;
        this.NINO = NINO;
        this.bankAccountNo = bankAccountNo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNINO() {
        return NINO;
    }

    public void setNINO(String NINO) {
        this.NINO = NINO;
    }

    public int getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(int bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

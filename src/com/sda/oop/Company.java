package com.sda.oop;


public class Company {

    private Employee[] employees;  // employees as an array attribute
    private String companyName;
    private String address; // extra field

    public Company(String companyName, Employee[] employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double calculateAverageEmployeeAge() {
        double sum = 0;
            for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getAge();
        }
        return sum / employees.length;  // average age
    }

    public void check() {
        System.out.println("Company's name is: " + companyName);  // extra field
    }
}

package com.sda.oop;
//  Create a class called Person(Parent class). They should have: name, age.
//  Create a class called Employee(Child class). This class should inherit the Person class.
//  And should have the extra fields:company id, company name.
//  Create a class called Company. This class should take in employees as an array attribute,  and have a name.
//  In your main method, Populate a company’s employees attribute and find the average age of the employees

public class Employee extends Person {
    // fields for Employees
    private String companyId;
    private String companyName;

    public Employee(String name, int age, String companyName, String companyId) {
        super (name, age);  // reference to parent class - Person
        this.companyId = companyId;
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}


package com.sda.oop;

// // Write two classes
//    // Animal class Fields - String type, String number of legs
//    // Methods - String sounds it makes, movement

//    // Bird - fields: color, doesItFly
//    // Methods - fly (), sing()

public class Animal {
    private String type;
    private int noOfLegs;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoOfLegs() {
        return this.noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public void walk() {
        System.out.println("Animal is walking");
    }

    public void sounds() {
        System.out.println("Animal is making sounds");
    }

}



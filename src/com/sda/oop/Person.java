package com.sda.oop;

import com.sda.example.Testing;

import javax.swing.*;

public class Person {

    // Define the properties or attributes of a person

    private String name;
    private int age;
    private double height;
    private double weight;
    private double BMI;


    // Constructor - is a utility that allows us to create instances of object

    // Method/Constructor overloading - a way to define multiple constructors
    // methods with the same name but they must have diff. method/constructor signatures
    // This is number and data type of the parameters and the order in which those parameters are defined

    public Person() {  // name of the Class
    }

    public Person (String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // For task to inherit in class Employee
    public Person (String name, int age ){
        this.name = name;
        this.age = age;
    }

    // Getters allow us read data from the class
    // Setters allow us write data to the class


    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        this.age = age;
    }

   // public void changeAge() {
    //    age++;
    //}
    public double person_BMI (){
        BMI = weight/(height*height);
        return BMI;
    }

    // Constructor to print information
    /*public void check() {
        System.out.println(name);
    }*/

    public static void main(String[] args) {

        Person george = new Person("George", 25, 1.84, 80.0);
        Person victoria = new Person("Victoria", 21, 1.67, 61.5);

        // victoria.check();  // returns info in Constructor public void check()

        System.out.println("BMI for Victoria is: " + victoria.person_BMI());
        System.out.println("BMI for George is: " + george.person_BMI());


        //        victoria.setName("Victoria");
        //        george.setName("George");
        //        System.out.println(george.getName());
        //        System.out.println(victoria.getName());

        // to change age +1:
        //victoria.changeAge();
        //System.out.println(victoria.getAge()); // new age 22

    }
}




package com.sda.example;

public class Main {

    public static void main(String[] args) {

        // comment - isn't executed
        // Java is a strictly-typed language
        // Java is a compiled language

        float number; //variable declaration
        number = 4; // variable initialization
        float value = 6; // variable declaration and initialization in one line.

//        char charValue = '9';
//        String text = "I am going to school";
//        long digits = 5L;
        // float decimalFloat = 3.683f;
        // double decimalDouble = 5.2323235353;

        // Arithmetic Operators include:
        // + - Addition
        System.out.println("Addition of number and value is: " + (number + value));
        // - - Subtraction
        System.out.println("Substraction of number and value is: " + (number - value));
        // / - Division
        System.out.println("Division of number and value is: " + (number / value));
        // * - Multiplication
        System.out.println("Multiplication of number and value is: " + (number * value));
        // % - Modulus (It divides the values and returns the remainder) e.g 2 % 2 -> 0
        System.out.println("Modulus of number and value is: " + (number % value));

        // = Assignment

        // Our first Java program

        System.out.println("Hello World!");
        }

    }
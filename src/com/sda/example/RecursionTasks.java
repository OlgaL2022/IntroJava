package com.sda.example;
import java.util.Scanner;
import java.util.Arrays;


public class RecursionTasks {
    public static void main(String[] args) {

        // Task 1: Using recursion, write a method that takes a number as a parameter and
        // returns the total sum between one and that number;
        // upToNumber(8) -> 1 + 2 + ... + 8

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int input = scanner.nextInt();
        System.out.println("The total sum between one and your number is: " + totalSum(input));  // totalSum(8)*/


        // Task 2: Using recursion, write a method that tasks a string as a parameter and
        // returns the reverse of the string.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your string: ");
        String input = scanner.next();
        System.out.println("The reverse of your string is: " + reverse(input));
    }
    // For  task 1: sum of numbers
    /*public static int totalSum(int n) {
        // Base case
        if (n < 1) {
            return n;
        }// Step of recursion / recursive condition
        else {
            return n + totalSum(n - 1);
        }
    }*/

    // For task 2: reverse string
    public static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        }
            return reverse(s.substring(1)) + s.charAt(0);  //calls the reverse method to take the first character and reverse it
        }
}










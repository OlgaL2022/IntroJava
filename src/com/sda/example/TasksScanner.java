package com.sda.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TasksScanner {
    public static void main(String[] args) {
        // Task1: Write a program that returns true interactively, if a user enters a string
        // containing any of these characters: 'u', 'w', '6', 'i', 'b', 'q'
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your string: ");
        String input = scanner.next();
        Pattern p = Pattern.compile("[uw6ibq]");
        Matcher m = p.matcher(input);
        if (m.find()) {
            System.out.println("Your sting contains 1 or more of these symbols: " + "uw6ibq");
        } else {
            System.out.println("No match found this time");
            scanner.close ();
        }*/


        // Task2:Write a program that accepts a String from a user and prints an interactive response telling
        // the user if the word is the same when spelt backwards.
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your string: ");
        String input = scanner.next();
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if (reversed.equals(input)) {
            System.out.println("Your word is the same when spelt backwards");
        } else {
            System.out.println("Your word is not the same when spelt backwards");
            scanner.close ();
        }*/

        //Task3: Write a program that accepts any of the primary colors as a String and
        // returns the complimentary color of that color to the user.
        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter any primary color: Yellow, Blue or Red: ");
        String color = scan.next().toLowerCase();
        switch (color) {
            case "yellow":
                System.out.println("Your complimentary color is: " + "Purple");
                System.out.println("Thank you!");
                break;
            case "blue":
                System.out.println("Your complimentary color is: " + "Orange");
                System.out.println("Thank you!");
                break;
            case "red":
                System.out.println("Your complimentary color is: " + "Green");
                System.out.println("Thank you!");
                break;
            default:
                System.out.println("Sorry, no complimentary color today!");
                scan.close();
        }
    }
}

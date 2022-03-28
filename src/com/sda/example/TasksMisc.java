package com.sda.example;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class TasksMisc {
    public static void main(String[] args) {

        // Task 1: program takes in the weight and height of 5 people and return the average BMI of the group
        // BMI = weight (kg) ÷ height2 (m)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight and height of five people in kg and cm: ");
        double bmi = 0;
        for (int i = 0; i < 5; i++) {
            int weight = scanner.nextInt();
            int height = scanner.nextInt();
            bmi += (weight / pow(height, 2));
        }
        System.out.println("The average BMI of the group is " + (bmi / 5));


        // Task 2: Get string from the user, return the character and count of the
        //character that occurs the most in the string.

        System.out.println("Enter your string: ");
        String input = scanner.next();
        int[] counters = new int['z'];  // ascii table last index z = 122
        for (int i = 0; i < input.length(); i++) {
            counters[input.charAt(i)]++;
        }
        int indexOfMax = 0;
        for (int i = 0, currentMax = 0; i < counters.length; i++) {
            if (counters[i] > currentMax) {
                currentMax = counters[i];
                indexOfMax = i;
            }
        }
        char c = (char) indexOfMax;
        System.out.println("Character that occurs the most in the string is " + c + " with " + counters[indexOfMax] + " occurrences.");


        // Task 3:Items on your list ["Bananas", "Bread", "Fish"]
        //Cost is [12, 5, 10], your current cash is 20 dollars. Which of the item you can safely buy.
        //Priority  - Bananas [least], fish [second], bread [first]

        //Check if can buy bread and then fish as prioritized:
        String[] items = { "Bananas", "Bread", "Fish" };
        int[] cost = { 12, 5, 10 };
        Arrays.sort(cost);
        int budget = 20;
        int sum = 0;

        for (int i = 0; i < cost.length; i++) {
            if (sum + cost[i] <= budget) {
                sum += cost[i];

            }
        }
        System.out.println(sum + " " + "usd");


        // Task Magic date: Receive the year, month and day separately
        //The year should be a four digit number. Determine if the date is a magic date.
        //Magic date is when:
        //month * day is a 1 digit number that matches the last digit of the year OR
        //month * day is a 3 digit number that matches the last 2 digits of the year OR
        //month * day is a 3 digit number that matches the last 3 digits of the year

        System.out.println("Enter day: ");
        int day = scanner.nextInt();
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        System.out.println("Enter year (four-digit format): ");
        int year = scanner.nextInt();
        int md = day * month;
        if ((md < 10 && md == (year % 10))  // % to get the last digit
                || (md >= 10 && md < 100 && md == (year % 100))
                || (md >= 100 && md < 1000 && md == (year % 1000))) {
            System.out.printf("%d.%d.%d is a magic number", day, month, year);
        } else {
            System.out.printf("%d.%d.%d is not a magic number", day, month, year);
        }

    }
}

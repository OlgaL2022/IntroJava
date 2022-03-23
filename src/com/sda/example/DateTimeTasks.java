package com.sda.example;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeTasks {
    public static void main(String[] args) {

        // TASK 1: Write a Java program to get year and months between two dates.

        /*LocalDate first = LocalDate.of(2000, Month.MARCH, 30);
        LocalDate today = LocalDate.now();

        Period age = Period.between(first, today);
        int years = age.getYears();
        int months = age.getMonths();

        System.out.println("number of years: " + years);
        System.out.println("number of months: " + months);*/


        // TASK2 : Write a Java program to get difference between two dates in days.
        //Difference between today and entered day
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one date in format Year-day-month: ");
        LocalDate first = LocalDate.parse(scanner.next());  //2022-03-20
        LocalDate today = LocalDate.now();
        long days = ChronoUnit.DAYS.between(first, today);

        System.out.println("Number of days: " + days);
    }
    }


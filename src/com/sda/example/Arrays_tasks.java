package com.sda.example;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays_tasks {
    public static void main(String[] args) {
        // Task1: Write a program that receives some numbers based on
        // the user’s choice and then returns the largest number of the ones the user entered.

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to enter? ");
        int amount = scanner.nextInt();
        int[] array = new int[amount];
        System.out.println("Enter your numbers:  ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max)
               max = array[i] ;
        }
        System.out.println("Largest number is:"+max);
    }*/

        // Task 2: Write a program that accepts a String from the user and returns an array of integers representing
        // the counts of each vowel in the String. The array returned by your method should hold 5 elements:
        // the first is the count of As, the second is the count of Es, the third Is, the fourth Os, and the fifth Us.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string here: ");
        String input = scanner.nextLine().toLowerCase();
        int[] array = new int[5];
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'a':
                    array[0]++;
                    break;
                case 'e':
                    array[1]++;
                    break;
                case 'i':
                    array[2]++;
                    break;
                case 'o':
                    array[3]++;
                    break;
                case 'u':
                    array[4]++;
                    break;
            }
        }
        scanner.close();
        System.out.println(array[0] + " A, " + array[1] + " E, " + array[2] + " I, " + array[3] + " O, " + array[4] + " U");
    }
}


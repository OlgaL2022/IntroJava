package com.sda.example;
import java.util.Scanner;
import java.util.Arrays;

public class Arrays_tasks2 {
    public static void main(String[] args) {
        // Task 1: You're given a string of words from the user. You need to find the word "Nemo", and return a string like this:
        //"I found Nemo at [the order of the word you find Nemo]!". If you can't find Nemo, return "I can't find Nemo :(".

       /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Nemo string here: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        boolean containsNemo = false;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Nemo")) {
                System.out.println("I found Nemo in word number " + (i + 1));
                containsNemo = true;
            }
        }

        if (!containsNemo) {
            System.out.println("I can't find Nemo :(");
        }
*/

        //Task 2: Write a program to return the second largest number from a stream of
        // inputted integers from the user.

        /*Scanner scanner = new Scanner (System.in);
        System.out.print("How many numbers you want to enter? ");
        int[]input = new int[scanner.nextInt()];
        for (int i = 0; i < input.length; i++) {
            System.out.print("Enter a number: ");
            input[i]= scanner.nextInt();
        }
        Arrays.sort(input);
        // System.out.println("Sorted arrays: " + Arrays.toString (input));
        System.out.println("The second largest number is " + input[input.length - 2]);*/


        // Task 3:Create a program that takes an array of Strings (You can intialize the variable without user input)
        // and checks if the last item matches the rest of the array concatenated together.
        // For example,  ["i", "love", "tesh", "ilovetesh"] will return true

        String[] text = { "i", "love", "travelling", "ilovetravelling" };
        String concatenated = "";
        for (int i = 0; i < text.length - 1; i++) {
            concatenated += text[i];
        }
        System.out.println("Are they equal? " + concatenated.equals(text[text.length - 1]));

    }
}

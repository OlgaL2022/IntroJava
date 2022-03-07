package com.sda.example;

public class StringTasks {
    public static void main(String[] args) {
        //TASKS:

        // 1.Write a program to compare two strings by their length and return output that tells
        // the user if the strings are equal or not.
        String firstString = "text";
        String secondString = "longertext";
        if (firstString.length() == secondString.length()) {
            System.out.println(firstString + " length is equal to " + secondString + " length");
        } else {
            System.out.println("Strings are not equal");
        }

        //2. Write a program to add as many 'r's to 'burp' by using a variable to regulate.
        // For example, if that variable is set to 4, then it will return an output like 'burrrrp'.
        String original = "burp";
        String charToReplace = "r";
        int multiplier = 4;
        System.out.println(original.replaceAll(charToReplace, charToReplace.repeat(multiplier)));

        // 3.  Write a program to remove the first and last letters of a string. e.g. hello becomes ell.
        String input = "hello";
        String replaced = input.replaceAll("[ho]", "");
        System.out.println(replaced);

        // 4 Write a program to reverse a string and capitalize all the letters. e.g. hello becomes OLLEH.
        String input = "hello";
        String rev = "";
        for (int i = input.length()-1; i >= 0 ; i--) {
        rev = rev + input.charAt(i);
        }
        System.out.println(rev.toUpperCase());

    }
}

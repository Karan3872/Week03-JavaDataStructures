package com.tit.day0405searchingreadingstringtype.stringbuilder.removeduplicates;

import java.util.Scanner;

// Creating a class Problem2 to demonstrate the RemoveDuplicates functionality
class Main
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Please Enter a String: ");

        // Read the input string
        String input = sc.nextLine();

        // Remove duplicates from the input string using the RemoveDuplicates class
        String output = RemoveDuplicates.removeDuplicatesFromString(input);

        // Display the original and modified strings
        System.out.println("String Before Removing Duplicates: " + input);
        System.out.println("String After Removing Duplicates: " + output);

        // Close the Scanner object
        sc.close();
    }
}

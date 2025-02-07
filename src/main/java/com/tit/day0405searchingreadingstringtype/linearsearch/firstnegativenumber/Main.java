package com.tit.day0405searchingreadingstringtype.linearsearch.firstnegativenumber;

public class Main
{
    public static void main(String[] args) {
        // Example array for testing
        int[] array = {3, 5, 7, -2, 8, -6, 4};

        // Find and print the index of the first negative number
        int index = LinearSearch.findFirstNegative(array);
        if (index != -1) {
            System.out.println("The first negative number is at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}

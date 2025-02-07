package com.tit.day0405searchingreadingstringtype.binarysearch.findfirstandlastoccurrence;

public class Main
{
    public static void main(String[] args) {
        // Example sorted array for testing
        int[] array = {2, 4, 10, 10, 10, 18, 20};

        // Target value to search for
        int target = 10;

        // Find and print the first and last occurrence of the target value
        int firstOccurrence = BinarySearch.findFirstOccurrence(array, target);
        int lastOccurrence = BinarySearch.findLastOccurrence(array, target);

        System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence);
        System.out.println("Last occurrence of " + target + " is at index: " + lastOccurrence);
    }
}


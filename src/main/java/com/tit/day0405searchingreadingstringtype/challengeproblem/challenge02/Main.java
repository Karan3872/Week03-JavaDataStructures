package com.tit.day0405searchingreadingstringtype.challengeproblem.challenge02;

import java.util.Arrays;

// Creating a class Main to demonstrate the usage of Challenge class
public class Main
{
    public static void main(String[] args) {
        // Example list of integers for testing
        int[] array = {3, 4, -1, 1, 5, 7, 10, 8, 6, 15, 2, 9, 11, 12, 0, 14, 13, 18, 17, 19, 16};

        // Find and print the first missing positive integer

        int firstMissingPositive = LinearAndBinarySearch.findFirstMissingPositive(array);
        System.out.println("First missing positive integer: " + firstMissingPositive);

        // Sort the array for binary search
        Arrays.sort(array);

        // Target value to search for
        int target = 4;

        // Find and print the index of the target value using binary search
        int targetIndex = LinearAndBinarySearch.binarySearch(array, target);
        System.out.println("Index of the target value " + target + ": " + targetIndex);
    }
}


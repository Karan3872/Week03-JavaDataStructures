package com.tit.day06runtimeanalysisandalgorithms.searchatarget;

import java.util.Arrays;
import java.util.Random;

public class ComparisonSearch {

    public static void main(String[] args) {
        // Dataset sizes to test
        int[] datasetSizes = {1000, 10000, 1000000};

        // Creating objects of LinearSearchAlgorithm and BinarySearchAlgorithm classes
        LinearSearch linear = new LinearSearch();
        BinarySearch binary = new BinarySearch();

        // Generate random data for each dataset size and measure search times
        for (int size : datasetSizes) {
            int[] data = new int[size];
            Random rand = new Random();
            for (int i = 0; i < size; i++) {
                data[i] = rand.nextInt(10000); // Random data
            }

            // Select a random target value from the dataset
            int target = rand.nextInt(10000);

            // Perform Linear Search
            long startTime = System.nanoTime(); // Record start time
            linear.linearSearch(data, target);
            long endTime = System.nanoTime(); // Record end time
            long linearSearchTime = endTime - startTime; // Calculate search time

            // Sort data for Binary Search
            Arrays.sort(data);

            // Perform Binary Search
            startTime = System.nanoTime(); // Record start time
            binary.binarySearch(data, target);
            endTime = System.nanoTime(); // Record end time
            long binarySearchTime = endTime - startTime; // Calculate search time

            // Displaying results
            System.out.println("Dataset Size: " + size);
            System.out.println("Target Value: " + target);
            System.out.println("Linear Search Time: " + linearSearchTime / 1000000.0 + " ms");
            System.out.println("Binary Search Time: " + binarySearchTime / 1000000.0 + " ms");
            System.out.println(); // Print a new line for better readability
        }
    }
}

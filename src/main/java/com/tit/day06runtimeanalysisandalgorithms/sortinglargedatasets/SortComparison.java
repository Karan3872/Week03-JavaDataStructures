package com.tit.day06runtimeanalysisandalgorithms.sortinglargedatasets;

import java.util.Arrays;
import java.util.Random;

// Creating a class SortComparison to demonstrate the functionalities of sorting algorithms
class SortComparison {
    public static void main(String[] args) {
        // Dataset sizes to test
        int[] datasetSizes = {1000, 10000, 1000000};

        // Creating objects of BubbleSort, MergeSort, and QuickSort classes
        BubbleSort bubble = new BubbleSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();

        // Generate random data for each dataset size and measure sorting times
        for (int size : datasetSizes) {
            int[] data = generateRandomArray(size);

            // Bubble Sort
            int[] dataCopy = Arrays.copyOf(data, data.length);
            long startTime = System.nanoTime();
            bubble.bubbleSort(dataCopy);
            long endTime = System.nanoTime();
            long bubbleSortTime = endTime - startTime;

            // Merge Sort
            dataCopy = Arrays.copyOf(data, data.length);
            startTime = System.nanoTime();
            merge.mergeSort(dataCopy);
            endTime = System.nanoTime();
            long mergeSortTime = endTime - startTime;

            // Quick Sort
            dataCopy = Arrays.copyOf(data, data.length);
            startTime = System.nanoTime();
            quick.quickSort(dataCopy);
            endTime = System.nanoTime();
            long quickSortTime = endTime - startTime;

            // Displaying results
            System.out.println("Dataset Size: " + size);
            System.out.println("Bubble Sort Time: " + bubbleSortTime / 1000000.0 + " ms");
            System.out.println("Merge Sort Time: " + mergeSortTime / 1000000.0 + " ms");
            System.out.println("Quick Sort Time: " + quickSortTime / 1000000.0 + " ms");
            System.out.println();
        }
    }

    // Helper method to generate a random array of the given size
    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(10000); // Random data
        }
        return data;
    }
}
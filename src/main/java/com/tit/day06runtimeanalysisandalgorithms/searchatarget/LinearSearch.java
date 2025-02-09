package com.tit.day06runtimeanalysisandalgorithms.searchatarget;

class LinearSearch {

    // Method to perform linear search in an array
    public static int linearSearch(int[] arr, int target) {
        int n = arr.length; // Get the length of the array
        // Iterate through each element of the array
        for (int i = 0; i < n; i++) {
            // Check if the current element is equal to the target element
            if (arr[i] == target) {
                return i; // Return the index of the target element if found
            }
        }
        return -1; // Return -1 if the target element is not found in the array
    }

}

package com.tit.day06runtimeanalysisandalgorithms.searchatarget;
class BinarySearch {

    // Method to perform binary search in a sorted array
    public static int binarySearch(int[] arr, int target) {

        int start = 0; // Initialize the start index
        int end = arr.length - 1; // Initialize the end index

        // Loop until the start index is less than or equal to the end index
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index
            // Check if the target element is at the middle index
            if (arr[mid] == target) {
                return mid; // Return the index of the target element if found
            }
            // If the target element is greater than the element at the middle index
            else if (arr[mid] < target) {
                start = mid + 1; // Move the start index to mid + 1
            }
            // If the target element is less than the element at the middle index
            else {
                end = mid - 1; // Move the end index to mid - 1
            }
        }
        return -1; // Return -1 if the target element is not found in the array
    }

}

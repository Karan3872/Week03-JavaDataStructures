package com.tit.day0405searchingreadingstringtype.binarysearch.searchvaluein2dsortedarray;

public class Main
{
    public static void main(String[] args) {
        // Example 2D matrix for testing
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        // Target value to search for
        int target = 3;

        // Find and print whether the target value is found in the matrix
        boolean isFound = BinarySearch.searchMatrix(matrix, target);
        System.out.println("Is the target value " + target + " found in the matrix? " + isFound);
    }
}

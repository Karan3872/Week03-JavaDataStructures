package com.tit.day02stackqueueandhashing.hashmapandhashing.twosumproblem;

// Creating a class TwoSumProblem to demonstrate finding two indices with the given sum
class Main
{
    public static void main(String[] args) {
        // Example array and target sum
        int[] nums = {2, 7, 11, 15,7};
        int target = 9;
        // Find two indices with the given sum
        int[] result = TwoSum.findTwoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices with the given sum: [" + result[0] + ", " + result[1] + "]");  // Output: Indices with the given sum: [0, 1]
        } else {
            System.out.println("No pair with the given sum found.");
        }
    }
}
package com.tit.day02stackqueueandhashing.hashmapandhashing.longestconsecutivesequence;

// Creating a class LongestConsecutiveSequenceProblem to demonstrate the finding of the longest consecutive sequence
class Main {
    public static void main(String[] args) {
        // Example array
        int[] nums = {100, 4, 200, 1, 3, 2};
        // Find the length of the longest consecutive sequence
        int result = ConsecutiveSequence.longestConsecutive(nums);

        // Print the result
        System.out.println("Length of the longest consecutive sequence: " + result);  // Output: Length of the longest consecutive sequence: 4
    }
}
package com.tit.day02stackqueueandhashing.stackandqueue.slidingwindowmaximum;
public class Main {

    public static void main(String[] args) {
        // Array of numbers to find the sliding window maximums
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        // Size of the sliding window
        int k = 3;
        // Call the maxSlidingWindow method to get the result array
        int[] result = slidingWindow.maxSlidingWindow(nums, k);

        // Print the sliding window maximums
        System.out.print("Sliding Window Maximums: ");
        for (int max : result) {
            System.out.print(max + " ");
        }
    }
}

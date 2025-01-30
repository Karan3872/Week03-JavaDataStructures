package com.tit.day02stackqueueandhashing.stackandqueue.slidingwindowmaximum;

import java.util.Deque;
import java.util.LinkedList;

public class slidingWindow {

    // Method to find the maximums in each sliding window of size k
    public static int[] maxSlidingWindow(int[] nums, int k) {
        // Edge cases: if the input array is null, empty, or if k is less than or equal to 0
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        // Array to store the maximums for each window
        int[] result = new int[n - k + 1];
        // Deque to store indices of useful elements within the current window
        Deque<Integer> deque = new LinkedList<>();

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements that are smaller than the current element
            // because they are not useful anymore
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current element's index to the deque
            deque.offerLast(i);

            // The front of the deque is the maximum for the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}

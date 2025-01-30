package com.tit.day02stackqueueandhashing.hashmapandhashing.zerosumsubarray;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


// Creating a class ZeroSumSubArrays to demonstrate the finding of zero-sum subarrays
class Main {
    public static void main(String[] args) {
        // Example array
        int[] nums = {1, 2, -3, 4, -1, 2, 1, -4, 2};

        // Find all subarrays with zero-sum
        List<int[]> subarrays = ZeroSum.findSubarraysWithZeroSum(nums);

        // Print the found subarrays
        for (int[] subarray : subarrays) {
            System.out.print("Subarray: [");
            for (int i = subarray[0]; i <= subarray[1]; i++) {
                System.out.print(nums[i] + (i < subarray[1] ? ", " : ""));
            }
            System.out.println("]");
        }
    }
}
package com.tit.day02stackqueueandhashing.stackandqueue.slidingwindowmaximum;

public class Main {


    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = slidingWindow.maxSlidingWindow(nums, k);

        System.out.print("Sliding Window Maximums: ");
        for (int max : result) {
            System.out.print(max + " ");
        }

    }
}

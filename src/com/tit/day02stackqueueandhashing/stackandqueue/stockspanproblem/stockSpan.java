package com.tit.day02stackqueueandhashing.stackandqueue.stockspanproblem;

import java.util.Stack;

public class stockSpan {

    // Method to calculate the span of stock prices
    public static void calculateSpan(int[] prices, int[] spans) {
        // Stack to store indices of the stock prices
        Stack<Integer> stack = new Stack<>();
        // Push the index of the first price onto the stack
        stack.push(0);
        // The span of the first day is always 1
        spans[0] = 1;

        // Loop through the remaining prices
        for (int i = 1; i < prices.length; i++) {
            // While the stack is not empty and the current price is greater than
            // or equal to the price at the index stored at the top of the stack
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                // Pop the top of the stack
                stack.pop();
            }
            // If the stack is empty, the span is the current index + 1
            // Otherwise, the span is the difference between the current index and the top index of the stack
            spans[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            // Push the current index onto the stack
            stack.push(i);
        }
    }
}

package com.tit.day02stackqueueandhashing.stackandqueue.sortstackusingrecursion;

import java.util.Stack;

// Main class to test the sorting of a stack using recursion
public class Main {

    // Main method: entry point of the application
    public static void main(String[] args) {

        // Create an instance of Stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(5);
        stack.push(9);
        stack.push(7);
        stack.push(5);
        stack.push(9);
        stack.push(2);

        // Display the unsorted stack
        System.out.println("Unsorted Stack: " + stack);

        // Sort the stack using recursion
        sortStack.sort(stack);

        // Display the sorted stack
        System.out.println("Sorted stack: " + stack);
    }
}

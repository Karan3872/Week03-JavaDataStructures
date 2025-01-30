package com.tit.day02stackqueueandhashing.stackandqueue.sortstackusingrecursion;

import java.util.Stack;

// Class representing a stack sorting using recursion
class sortStack {

    // Private field for the stack
    private Stack<Integer> stack;

    // Constructor for the sortStack class
    sortStack() {
        stack = new Stack<>();
    }

    // Method to sort the stack using recursion
    public static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Pop the top element
            int temp = stack.pop();
            // Recursively sort the remaining stack
            sort(stack);
            // Insert the popped element back into the sorted stack
            sortedInsert(stack, temp);
        }
    }

    // Method to insert an element into the sorted stack
    public static void sortedInsert(Stack<Integer> stack, int temp) {
        // If the stack is empty or the element is greater than the top element, push the element
        if (stack.isEmpty() || temp > stack.peek()) {
            stack.push(temp);
        } else {
            // Pop the top element
            int element = stack.pop();
            // Recursively call to insert the element
            sortedInsert(stack, temp);
            // Push the popped element back
            stack.push(element);
        }
    }
}

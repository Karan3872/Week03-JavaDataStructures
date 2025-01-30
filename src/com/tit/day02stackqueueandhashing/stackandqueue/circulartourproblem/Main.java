package com.tit.day02stackqueueandhashing.stackandqueue.circulartourproblem;

class Main {
    public static void main(String[] args) {
        // Example petrol and distance arrays
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        // Find the starting point for the circular tour
        int start = CircularTour.findStartingPoint(petrol, distance);

        // Print the starting point
        System.out.println("Starting point: " + start);  // Output: Starting point: 1
    }
}
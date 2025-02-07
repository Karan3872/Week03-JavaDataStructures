package com.tit.day0405searchingreadingstringtype.binarysearch.rotationpoint;

public class Main
{
    public static void main(String[] args) {
        // Example rotated sorted array for testing
        int[] array = {6, 7, 9,13, 15, 19, 2, 3,4};

        // Find and print the index of the rotation point
        int rotationPointIndex = BinarySearch.findRotationPoint(array);
        System.out.println("The rotation point is at index: " + rotationPointIndex);
    }
}

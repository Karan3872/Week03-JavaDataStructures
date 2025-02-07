package com.tit.day0405searchingreadingstringtype.binarysearch.peakelement;

public class Main
{
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 1, 0, 10, 8, 6,21, 7, 13, 12, 9, 5, 11};

        // Find and print the index of the peak element
        int peakElement = BinarySearch.findPeakElement(array);
        System.out.println("The peak element is : " + peakElement);
    }
}


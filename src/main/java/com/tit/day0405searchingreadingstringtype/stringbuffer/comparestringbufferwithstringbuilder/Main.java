package com.tit.day0405searchingreadingstringtype.stringbuffer.comparestringbufferwithstringbuilder;

// Creating a class Problem2 to demonstrate the comparison of StringBuffer and StringBuilder
public class Main
{
    public static void main(String[] args)
    {
        // Create an instance of CompareStringBufferAndStringBuilder
        compareString compare = new compareString();

        // Measure the time taken to concatenate strings using StringBuilder
        long durationStringBuilder = compare.concatenationStringByStringBuilder();

        // Measure the time taken to concatenate strings using StringBuffer
        long durationStringBuffer = compare.concatenationStringByStringBuffer();

        // Output the time taken by both classes for comparison
        System.out.println("Time Taken to concatenate string 1000000 times is as follows:");
        System.out.println("StringBuffer: " + durationStringBuffer + " nanoseconds");
        System.out.println("StringBuilder: " + durationStringBuilder + " nanoseconds");
    }
}

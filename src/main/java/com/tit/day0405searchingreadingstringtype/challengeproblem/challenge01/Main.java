package com.tit.day0405searchingreadingstringtype.challengeproblem.challenge01;

public class Main
{
    public static void main(String[] args) {
        // Specify the file path (update this path to your local file)
        String filePath = "src/main/java/com/tit/day0405searchingreadingstringtype/challengeproblem/challenge01/100MBFile.txt";

        // Measure and print the time for StringBuilder
        long durationStringBuilder = ComparePerformance.measureStringBuilder();
        System.out.println("Time taken by StringBuilder: " + durationStringBuilder + " nanoseconds");

        // Measure and print the time for StringBuffer
        long durationStringBuffer = ComparePerformance.measureStringBuffer();
        System.out.println("Time taken by StringBuffer: " + durationStringBuffer + " nanoseconds");

        // Measure and print the time for FileReader
        long durationFileReader = ComparePerformance.measureFileReader(filePath);
        System.out.println("Time taken by FileReader: " + durationFileReader + " nanoseconds");

        // Measure and print the time for InputStreamReader
        long durationInputStreamReader = ComparePerformance.measureInputStreamReader(filePath);
        System.out.println("Time taken by InputStreamReader: " + durationInputStreamReader + " nanoseconds");
    }
}

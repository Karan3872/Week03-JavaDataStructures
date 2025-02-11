package com.tit.day06runtimeanalysisandalgorithms.largefilereadingefficiency;

/*
Problem Statement: Large File Reading Efficiency
Description: Compare the performance of FileReader (Character Stream) and InputStreamReader (Byte Stream) for reading large files (500MB).
1. Define methods for reading a large file using FileReader and InputStreamReader.
2. Measure the time taken to read the file using each method.
3. Compare the performance results.
Goal: Understand the performance differences between FileReader and InputStreamReader for reading large files.
*/

import java.io.*;

// Creating a class FileReadingComparison to compare the performance of FileReader and InputStreamReader methods
class FileReadingComparison
{
    public static void main(String[] args) throws IOException {
        // String array to store file paths
        String[] filePaths = new String[1];
        filePaths[0]="src/main/java/com/tit/day06runtimeanalysisandalgorithms/largefilereadingefficiency/1MBFile.txt.txt";

        // Creating objects of FileReaderEfficiency and InputStreamReaderEfficiency classes
        FileReaderEfficiency fileReaderEfficiency = new FileReaderEfficiency();
        InputStreamReaderEfficiency inputStreamReaderEfficiency = new InputStreamReaderEfficiency();

        // Measure and display performance for each file path
        for (String filePath : filePaths) {
            System.out.println("File Path: " + filePath);

            // Measure time for FileReader
            long fileReaderTime = fileReaderEfficiency.readFileUsingFileReader(filePath);
            System.out.println("FileReader Time: " + fileReaderTime + " ms");

            // Measure time for InputStreamReader
            long inputStreamReaderTime = inputStreamReaderEfficiency.readFileUsingInputStreamReader(filePath);
            System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");

            System.out.println();
        }
    }
}

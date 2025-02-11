package com.tit.day06runtimeanalysisandalgorithms.largefilereadingefficiency;

import java.io.FileReader;
import java.io.IOException;

// Creating a class FileReaderEfficiency to represent reading a file using FileReader
class FileReaderEfficiency {
    // Method to read a file using FileReader
    public long readFileUsingFileReader(String filePath) throws IOException {
        long startTime = System.nanoTime();
        FileReader fileReader = new FileReader(filePath);
        while (fileReader.read() != -1) {
        }
        fileReader.close();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000; // Convert to milliseconds
    }
}

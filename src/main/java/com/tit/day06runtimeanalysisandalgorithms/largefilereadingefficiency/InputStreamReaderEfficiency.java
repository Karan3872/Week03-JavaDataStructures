package com.tit.day06runtimeanalysisandalgorithms.largefilereadingefficiency;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

// Creating a class InputStreamReaderEfficiency to represent reading a file using InputStreamReader
class InputStreamReaderEfficiency {
    // Method to read a file using InputStreamReader
    public long readFileUsingInputStreamReader(String filePath) throws IOException {
        long startTime = System.nanoTime();
        InputStream inputStream = new FileInputStream(filePath);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        while (inputStreamReader.read() != -1) {
        }
        inputStreamReader.close();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000; // Convert to milliseconds
    }
}

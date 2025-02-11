package com.tit.day06runtimeanalysisandalgorithms.largefilereadingefficiency;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;

class FileReadingEfficiencyTest
{

    @Test
    public void testFor1MBFile() throws IOException
    {
        FileReaderEfficiency fileReaderEfficiency = new FileReaderEfficiency();
        InputStreamReaderEfficiency inputStreamReaderEfficiency = new InputStreamReaderEfficiency();

        String filePath="src/test/java/com/tit/day06runtimeanalysisandalgorithms/largefilereadingefficiency/1MBFile.txt.txt";


       long fileReaderTime = fileReaderEfficiency.readFileUsingFileReader(filePath);
       long inputStreamReaderTime = inputStreamReaderEfficiency.readFileUsingInputStreamReader(filePath);

       System.out.println("FileReader Time for 1MB File: "+ fileReaderTime + " ms");
       System.out.println("InputStreamReader Time for 1 MB File: " + inputStreamReaderTime + " ms");

        // Adding a basic assertion to compare the two methods
        assertNotEquals(fileReaderTime, inputStreamReaderTime);
        System.out.println("Test case pass for 1MB file");

    }

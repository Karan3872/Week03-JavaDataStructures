package com.tit.day0405searchingreadingstringtype.filereader.readafile;

// Creating a class Problem1 to demonstrate the ReadAFiIe functionality
public class Main
{
    public static void main(String[] args)
    {
        // Create an instance of ReadAFiIe
        //
        readAFiIe reader = new readAFiIe();

        // Specify the file path
        String filePath = "src/main/java/com/tit/day0405searchingreadingstringtype/filereader/readafile/large_file.txt";

        // Read the file line by line using the ReadAFiIe class
        reader.readAFileLineByLine(filePath);
    }
}

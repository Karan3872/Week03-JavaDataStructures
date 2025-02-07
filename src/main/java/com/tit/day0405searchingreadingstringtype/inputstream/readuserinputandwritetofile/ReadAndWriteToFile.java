package com.tit.day0405searchingreadingstringtype.inputstream.readuserinputandwritetofile;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// Creating a class ReadUserInputAndWriteToFile to represent reading user input and writing to a file using InputStreamReader
 class ReadAndWriteToFile
{
    // Method to read user input and write it to a file
    public void readInputAndWriteToFile(String filePath)
    {
        // Try-with-resources statement to ensure the FileWriter is closed automatically
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(filePath, true)) // true to append data to the file
        {
            String input;
            System.out.println("Enter text to write to the file. Type 'exit' to finish:");
            // Loop to read user input until "exit" is entered
            while (!(input = br.readLine()).equalsIgnoreCase("exit"))
            {
                // Write the input to the file
                fw.write(input + System.lineSeparator());
            }
        }
        catch (IOException e)
        {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }
    }
}

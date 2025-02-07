package com.tit.day0405searchingreadingstringtype.inputstream.readuserinputandwritetofile;

public class Main
{
    public static void main(String[] args)
    {
        // Create an instance of ReadUserInputAndWriteToFile
        ReadAndWriteToFile readerWriter = new ReadAndWriteToFile();

        // Specify the file path (update this path to your local file)
        String filePath = "src/main/java/com/tit/day0405searchingreadingstringtype/inputstream/readuserinputandwritetofile/text_file.txt";

        // Read user input from the console and write it to the file using the ReadUserInputAndWriteToFile class
        readerWriter.readInputAndWriteToFile(filePath);
    }
}

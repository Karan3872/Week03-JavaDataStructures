package com.tit.day0405searchingreadingstringtype.inputstream.convertbytetocharacterstream;

// Creating a class to demonstrate the ConvertByteStreamToCharacterStream functionality
public class Main
{
    public static void main(String[] args)
    {
        // Create an instance of ConvertByteStreamToCharacterStream
        ConvertByteToCharacter converter = new ConvertByteToCharacter();

        // Specify the file path (update this path to your local file)
        String filePath = "src/main/java/com/tit/day0405searchingreadingstringtype/inputstream/convertbytetocharacterstream/text_file.text";

        // Read binary data from the file and print it as characters using the ConvertByteStreamToCharacterStream class
        converter.readBinaryDataAsCharacters(filePath);
    }
}


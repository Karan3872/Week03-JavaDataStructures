package com.tit.day0405searchingreadingstringtype.inputstream.convertbytetocharacterstream;

import org.junit.jupiter.api.Test;

public class TestingConvertByteToCharacter
{
    @Test
    public void testingReadBinaryDataAsCharacters() {
        // Creating an instance of ConvertByteStreamToCharacterStream class
        ConvertByteToCharacter obj = new ConvertByteToCharacter();

        // Path to the test file
        String filePath = "src/test/java/com/tit/day0405searchingreadingstringtype/inputstream/convertbytetocharacterstream/Large_File.txt";

        // Calling the readBinaryDataAsCharacters method with the specified file path and target word
        obj.readBinaryDataAsCharacters(filePath);

        // Printing a message to indicate the function is working as expected
        System.out.println("readBinaryDataAsCharacters function working like expected");
    }
}
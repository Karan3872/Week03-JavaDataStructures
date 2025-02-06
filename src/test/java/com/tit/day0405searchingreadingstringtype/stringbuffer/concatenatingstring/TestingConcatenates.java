package com.tit.day0405searchingreadingstringtype.stringbuffer.concatenatingstring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestingConcatenates {

    @Test
    public void testConcatenates(){

        concatenateString cs = new concatenateString();

        String[] input = {"Hello1 ", "Hello2 ", "Hello3 ", "Hello4 ", "Hello5 ", "Hello6 ", "Hello7"};

        String output = "Hello1 Hello2 Hello3 Hello4 Hello5 Hello6 Hello7";

        String s = concatenateString.concatenateStringUsingStringBuffer(input);

        assertEquals(output , s);

        System.out.println("Both input output case are matched");
    }

}

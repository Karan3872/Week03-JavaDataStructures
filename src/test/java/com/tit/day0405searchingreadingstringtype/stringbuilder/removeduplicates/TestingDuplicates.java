package com.tit.day0405searchingreadingstringtype.stringbuilder.removeduplicates;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

  public class TestingDuplicates{
      @Test
    public void testDuplicates(){
       //creating the object of the class removeduplicates
        RemoveDuplicates rd = new RemoveDuplicates();

        //intializing the input
        String input = "Programming";
        //calling the remove method
        String str  = rd.removeDuplicatesFromString(input);

        //calling the assert method to check whether they are equals
        assertEquals("Progamin",str);

        //To print the given message
          System.out.println("The given input meet the expected output");
   }



}

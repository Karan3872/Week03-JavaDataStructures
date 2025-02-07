package com.tit.day0405searchingreadingstringtype.stringbuffer.comparestringbufferwithstringbuilder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingCompares {

    @Test
    public void TestCompares(){

        compareString sb = new  compareString();

        long byStringBuilder = sb.concatenationStringByStringBuilder();

        long byStringBuffer = sb.concatenationStringByStringBuilder();

        try{
            assertEquals(byStringBuffer,byStringBuilder);
            System.out.println("Time taken by stringBuffer and stringBuilder are same");
        }
        catch(Error e){
            System.out.println("Error - "+e.getMessage());
            System.out.println("Time taken by stringBuffer and stringBuilder are not same");
        }

    }

}

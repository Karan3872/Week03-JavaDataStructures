package com.tit.day0405searchingreadingstringtype.stringbuilder.reversestring;

//import com.tit.day0405searchingreadingstringtype.stringbuilder.reversestring.;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testingReverseStrings {

    @Test
    public void test(){
        ReverseString re=new ReverseString();
        String str=re.reverse("racecar");
        assertEquals("racecar",str);
        System.out.println("Both the string are same");
    }
}

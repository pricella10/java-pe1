package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;


public class CharCheckTest {


    @Test
    public void CheckTest1()
    {
        Charcheck charcheck = new Charcheck();
        String result = charcheck.Charcheck("p");
        assertEquals("consonant",result);
    }
@Test
    public void CheckTest2()
    {
        Charcheck charcheck = new Charcheck();
        String result = charcheck.Charcheck("a");
        assertEquals("vowel",result);
    }


}

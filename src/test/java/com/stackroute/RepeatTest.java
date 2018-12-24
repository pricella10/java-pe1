package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;
public class RepeatTest {

    @Test
    public void rep()
    {
        Repeat repeat = new Repeat();
        String result = repeat.Repeat("chintu",2);
        assertEquals("chintuutut",result);

    }
}

package com.stackroute;

import static org.junit.Assert.*;
import org.junit.Test;



    public class PatternTest {


        @Test

        public void Pattern()
        {
            Pattern pattern = new Pattern();
            int result = pattern.Pattern(3);
            assertEquals(122333,result);
        }
    }


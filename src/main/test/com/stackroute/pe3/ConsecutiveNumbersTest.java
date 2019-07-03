package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.ConsecutiveNumbers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers object;
    @Before
    public void setUp() throws Exception {
        object=new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }


    @Test
    public void checkConsecutiveNumbers() {
        boolean expected = true;
        boolean actual = object.checkForConsecutiveNumbers("54,53,52,51,50,49,48");

        assertEquals(expected, actual);
    }

    @Test
    public void checknonConsecutiveNumbers() {
        boolean expected = false;
        boolean actual = object.checkForConsecutiveNumbers("1,2,3,4,5,6,6");

        assertEquals(expected, actual);
    }
}


package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.CalculateDayOfWeek;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateDayOfWeekTest {
    CalculateDayOfWeek calculate;
    @Before
    public void setUp() {

        calculate = new CalculateDayOfWeek();
    }

    @After
    public void tearDown() {

        calculate = null;
    }

    @Test
    public void calculateFirstAndLastDateOfTheWeek() {
        String result = calculate.calculateFirstAndLastDateOfTheWeek();
        assertEquals("Mon 01/07/2019Sun 07/07/2019",result);
    }
}
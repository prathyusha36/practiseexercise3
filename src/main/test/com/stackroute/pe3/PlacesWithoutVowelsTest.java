package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.PlacesWithoutVowels;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlacesWithoutVowelsTest {
    PlacesWithoutVowels test;
    @Before
    public void setUp() {
        test =new PlacesWithoutVowels();
    }

    @After
    public void tearDown() {
        test=null;
    }

    @Test
    public void convertPlaceNamesWithoutVowelsWithInputAsStrings()
    {
        String[] result = test.convertPlaceNamesWithoutVowels(new String[] {"india","bangladesh","united states"});
        assertArrayEquals(new String[]{"nd","bngldsh","ntd stts"},result);
    }
    @Test
    public void inputWithSpacesGivesError()
    {
        String[] result = test.convertPlaceNamesWithoutVowels(new String[] {" ","bangladesh","united states"});
        assertArrayEquals(new String[]{" ","bngldsh","ntd stts"},result);
    }
    @Test
    public void convertPlaceNamesWithoutVowelsWithInputAsNumbers()
    {
        String[] result = test.convertPlaceNamesWithoutVowels(new String[] {"1123","7865","66868"});
        assertArrayEquals(new String[]{"1123","7865","66868"},result);
    }

}
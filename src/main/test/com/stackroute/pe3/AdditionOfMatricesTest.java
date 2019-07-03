package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.AdditionOfMatrices;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatricesTest {
    AdditionOfMatrices matrix;
    @Before
    public void setUp() {
        matrix = new AdditionOfMatrices();
    }

    @After
    public void tearDown()
    {
        matrix = null;
    }

    @Test
    public void addTwoMatricesTakingCorrectInput()
    {
        int arr[][]=matrix.addTwoMatrices(3,2,new int[][] {{1,2},{3,4},{5,6}},new int[][] {{9,8},{7,6},{5,4}});
        assertArrayEquals(new int[][]{{10,10},{10,10},{10,10}},arr);

    }
    @Test
    public void addTwoMatricesTakingNegativeNumbers()
    {
        int arr[][]=matrix.addTwoMatrices(3,2,new int[][] {{1,2},{3,4},{5,6}},new int[][] {{-9,-8},{7,6},{5,4}});
        assertArrayEquals(new int[][]{{-8,-6},{10,10},{10,10}},arr);

    }


}
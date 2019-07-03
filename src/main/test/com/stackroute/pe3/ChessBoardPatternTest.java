package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.ChessBoardPattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {
    ChessBoardPattern pattern;
    @Before
    public void setUp() {
        pattern = new ChessBoardPattern();
    }

    @After
    public void tearDown() {
        pattern = null;
    }

    @Test
    public void createChessBoardPattern() {
        String result[][] = pattern.createChessBoardPattern();
        assertArrayEquals(new String[][] {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}}
                ,result);
    }

}
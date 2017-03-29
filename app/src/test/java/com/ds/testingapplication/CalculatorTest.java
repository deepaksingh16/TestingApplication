package com.ds.testingapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deepaksingh on 29/03/17.
 */
public class CalculatorTest {

    private Calculator mCalculator;
    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void sum() throws Exception {
        //expected: 6, sum of 1 and 5
        assertEquals(6d, mCalculator.sum(1d, 5d), 0);
    }

    @Test
    public void subtract() throws Exception {
        assertEquals(5d, mCalculator.subtract(6d, 1d), 0);
    }

    @Test
    public void divide() throws Exception {
        assertEquals(3, mCalculator.divide(9d, 3d), 0);
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(9d, mCalculator.multiply(3d, 3d), 0);
    }

}
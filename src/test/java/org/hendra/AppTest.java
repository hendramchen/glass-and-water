package org.hendra;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testCalculate2L() {
        float X = 2.0f; // Total amount of water
        PouringWater pouringWater = new PouringWater(2, 2, X);
        String amount = String.valueOf(pouringWater.calculateLiquid());
        assertEquals("0.5", amount);
    }

    @Test
    public void testCalculate1dot5L() {
        float X = 1.5f; // Total amount of water
        PouringWater pouringWater = new PouringWater(2, 2, X);
        String amount = String.valueOf(pouringWater.calculateLiquid());
        assertEquals("0.25", amount);
    }
}

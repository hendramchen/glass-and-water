package org.hendra;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int i = 2, j = 2;
        float X = 2.0f; // Total amount of water
        PouringWater pouringWater = new PouringWater(2, 2, X);
        pouringWater.displayResult();
    }
}

package com.interview.calculator;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class StringCalculatorTest 
{
    
    @Test
    public void addWhenEmptyTest()
    {
    	StringCalculator strCalc = new StringCalculator();
    	assertEquals(0, strCalc.Add(""));  	
    }
    
    @Test
    public void addForSingleNumberTest() {
    	StringCalculator strCalc = new StringCalculator();
    	assertEquals(7, strCalc.Add("7"));
    	
    }
    
    @Test
    public void addForTwoNumberTest() {
    	StringCalculator strCalc = new StringCalculator();
    	assertEquals(23, strCalc.Add("12,11"));
    	
    }
}

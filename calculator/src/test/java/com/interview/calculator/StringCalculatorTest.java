package com.interview.calculator;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class StringCalculatorTest 
{
	StringCalculator strCalc;
	
	@BeforeEach
	public void createObject() {
		strCalc = new StringCalculator();
	}
    
    @Test
    public void addWhenEmptyTest()
    {
    	assertAll(
    			() -> assertEquals(0, strCalc.Add("")),
    			() -> assertEquals(0, strCalc.Add("  "))
    			);
    }
    
    @Test
    public void addForSingleNumberTest() {
    	assertEquals(7, strCalc.Add("7"));
    	
    }
    
    @Test
    public void addForTwoNumberTest() {
    	assertEquals(23, strCalc.Add("12,11"));
    	
    }
    @Test
    public void addMoreThanOneNumbersTest() {
    	assertEquals(44, strCalc.Add("12,24,8"));
    	
    }
    @Test
    public void addLineSeparatorTest() {
    	assertAll(
    			() -> assertEquals(0, strCalc.Add("\n2,4,\n")),
    			() -> assertEquals(0, strCalc.Add("2,4,\n")),
    			() -> assertEquals(12, strCalc.Add("6\n6"))
    			);
    }
}

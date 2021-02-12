package com.interview.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class StringCalculator 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public int Add(String numbers) {
    	
    	int sumVal = 0;
    	if (numbers.trim().length() == 0){
    		return 0;
    	}
    	else {
    		String [] num = numbers.split(",");
    		
    		for (String s : num) {
    			sumVal += Integer.parseInt(s);
    		}
    		return sumVal;
    	}
    	
    	
    }
}

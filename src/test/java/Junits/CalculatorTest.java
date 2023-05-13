package Junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import code.Calculator;

public class CalculatorTest {
	
   
	@DisplayName("Two Positive no Test")
	@Tag("Sanity")
	@Test
	public void test1()
	{
		int result= Calculator.add(4, 5);
		
	    Assertions.assertEquals(9,result);
	}
 
	@DisplayName("One Positive and one Negative")
    @Tag("Sanity")
    @RepeatedTest(2)
    public void test2()
	{
		int result= Calculator.add(-4, 5);
		
	    Assertions.assertEquals(1,result);
	}
	
	@DisplayName("One Posive and One Negative")
    @Test
    public void test3()
    {
    	int result= Calculator.add(-6, 7);
    	Assertions.assertNotEquals(3, result);
    }
}


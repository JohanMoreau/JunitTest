package Examples;


import static org.junit.Assert.assertEquals; 

import org.junit.Test;

import junitTest.Operation;



public class OperationTest {

	@Test
	public void additionTest() {
		int a = 2;
		int b = 5;
		int expectedResult = Operation.addition(a,b);
		
		assertEquals(7,expectedResult);
		
	}
	
	@Test
	public void additionTestToFix() {
		int a = 2;
		int b = 5;
		int expectedResult = Operation.addition(a,b);
		
		assertEquals(8,expectedResult);
		
	}
}

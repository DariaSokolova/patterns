package com.epam.mentoring.patterns.behavioral.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContextTest {

	@Test
	public void testExecuteStrategy_Add() {	
	      Strategy strategy = new OperationAdd();
	      int num1 = 17;
	      int num2 = 4;
	      int expectedResult = num1 + num2;
	  
	      commonTest(strategy, num1, num2, expectedResult);
	}

	@Test
	public void testExecuteStrategy_Substract() {	
	      Strategy strategy = new OperationSubstract();
	      int num1 = 17;
	      int num2 = 4;
	      int expectedResult = num1 - num2;
	  
	      commonTest(strategy, num1, num2, expectedResult);
	}

	@Test
	public void testExecuteStrategy_Multiply() {	
	      Strategy strategy = new OperationMultiply();
	      int num1 = 17;
	      int num2 = 4;
	      int expectedResult = num1 * num2;
	  
	      commonTest(strategy, num1, num2, expectedResult);
	}
	
	private void commonTest(Strategy strategy, int num1, int num2, int expectedResult) {
	      Context context = new Context(strategy);
	      
	      int result = context.executeStrategy(num1, num2);	
	      
	      assertEquals(expectedResult, result);
	}
}

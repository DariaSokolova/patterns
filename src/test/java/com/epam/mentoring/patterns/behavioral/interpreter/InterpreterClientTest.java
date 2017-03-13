package com.epam.mentoring.patterns.behavioral.interpreter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InterpreterClientTest {
	private InterpreterClient client;
	
	@Before
	public void init() {
		InterpreterContext context = new InterpreterContext();
		client = new InterpreterClient(context);
	}
	
	@Test
	public void testInterpret_IntToBin() {
		String str = "15 in Binary";
		String expected = Integer.toBinaryString(15);
		
		String actual = client.interpret(str);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInterpret_IntToHext() {
		String str = "15 in Hexadecimal";
		
		String expected = Integer.toHexString(15);
		
		String actual = client.interpret(str);
		
		assertEquals(expected, actual);
	}
}

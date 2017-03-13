package com.epam.mentoring.patterns.structural.composite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrdinaryEmployeeTest {
	private static final String position = "dev";
	private Employee dev = new OrdinaryEmployee(position);
	
	@Test(expected = UnsupportedOperationException.class)
	public void testAddEmployee() {
		dev.addEmployee(null);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testRemoveEmployee() {
		dev.removeEmployee(null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testGetChield_WithIncorrectIndex() {				
		dev.getChield(0);
	}
	
	@Test
	public void testGetInfo() {					
		assertEquals(position, dev.getInfo());		
	}
}

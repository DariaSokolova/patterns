package com.epam.mentoring.patterns.structural.composite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ManagerTest {

	private static final String position = "manager";
	private Employee manager = new Manager(position);
	
	@Test
	public void testAddEmployee() {
		Employee employee = new OrdinaryEmployee("dev");
		
		manager.addEmployee(employee);
		
		assertEquals(employee, manager.getChield(0));
	}
	
	@Test
	public void testRemoveEmployee() {
		Employee employee = new OrdinaryEmployee("dev");
		
		manager.addEmployee(employee);
		manager.removeEmployee(employee);
		
		assertEquals(null, manager.getChield(0));
	}
	
	@Test
	public void testGetChield_WithIncorrectIndex() {				
		assertEquals(null, manager.getChield(0));
	}
	
	@Test
	public void testGetInfo() {					
		assertEquals(position, manager.getInfo());		
	}
}

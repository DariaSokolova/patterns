package com.epam.mentoring.patterns.creational.prototype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void testPrototype() throws CloneNotSupportedException {
		Employee employee1 = new Employee();
		employee1.setName("Ark");
		employee1.setPosition("Developer");
		employee1.setSalary(1000);
		
		Employee employee2 = employee1.clone();
		employee2.setName("Nark");

		assertEquals(employee1.getSalary(), employee2.getSalary());
		assertEquals(employee1.getPosition(), employee2.getPosition());
		assertNotEquals(employee1.getName(), employee2.getName());
	}
}

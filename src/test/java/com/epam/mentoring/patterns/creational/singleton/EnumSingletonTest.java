package com.epam.mentoring.patterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EnumSingletonTest {
	@Test
	public void TestGetInstance() {		
		EnumSingleton singleton1 = EnumSingleton.INSTANCE;
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;
		
		assertEquals(singleton1, singleton2);
	}
}

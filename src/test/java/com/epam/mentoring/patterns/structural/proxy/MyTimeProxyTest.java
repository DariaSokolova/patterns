package com.epam.mentoring.patterns.structural.proxy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyTimeProxyTest {

	private MyTimeProxy proxy = new MyTimeProxy();
	
	@Test
	public void TestFillMyTime_Lazy() {
		boolean lazyFactor = true;
		
		boolean result = proxy.fillMyTime(lazyFactor);
		
		assertFalse(result);
	}
	

	@Test
	public void TestFillMyTime_NotLazy() {
		boolean lazyFactor = false;
		
		boolean result = proxy.fillMyTime(lazyFactor);
		
		assertTrue(result);
	}
}

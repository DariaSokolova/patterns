package com.epam.mentoring.patterns.structural.facade;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MovieProductionTest {
	
	private MovieProduction movieProduction = new MovieProduction();
	
	@Test
	public void testCreateMovie() {
		assertTrue(movieProduction.createMovie());
	}
}

package com.epam.mentoring.patterns.creational.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BarmanTest {
	private Barman barman = new Barman();
	
	@Test
	public void testMakeCocktail_LondonFog() {
		CocktailBuilder builder = new LondonFogBuilder();
		
		Cocktail cocktail = barman.makeCocktail(builder);
		
		assertEquals(cocktail.getAlcohol(), "gin");
		assertEquals(cocktail.getAddition(), "ice");
		assertEquals(cocktail.getDrink(), "pernod");
	}

	@Test
	public void testMakeCocktail_Grog() {
		CocktailBuilder builder = new GrogBuilder();
		
		Cocktail cocktail = barman.makeCocktail(builder);

		assertEquals(cocktail.getAlcohol(), "rum");
		assertEquals(cocktail.getAddition(), "sugar");
		assertEquals(cocktail.getDrink(), "water");
	}
}

package com.epam.mentoring.patterns.creational.builder;

public class Barman {
	
	public Cocktail makeCocktail(CocktailBuilder builder) {
		builder.createCocktail();
		builder.addAlcohol();
		builder.addDrink();
		builder.addAddition();
		return builder.getCocktail();
	}
	
}

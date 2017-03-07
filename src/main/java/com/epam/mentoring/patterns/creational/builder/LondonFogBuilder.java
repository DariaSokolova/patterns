package com.epam.mentoring.patterns.creational.builder;


public class LondonFogBuilder extends CocktailBuilder {

	@Override
	public void addAlcohol() {
		cocktail.setAlcohol("gin");
	}

	@Override
	public void addDrink() {
		cocktail.setDrink("pernod");
	}

	@Override
	public void addAddition() {
		cocktail.setAddition("ice");
	}

}

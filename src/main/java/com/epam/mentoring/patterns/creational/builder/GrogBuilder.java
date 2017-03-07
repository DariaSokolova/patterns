package com.epam.mentoring.patterns.creational.builder;

public class GrogBuilder extends CocktailBuilder {

	@Override
	public void addAlcohol() {
		cocktail.setAlcohol("rum");
	}

	@Override
	public void addDrink() {
		cocktail.setDrink("water");
	}

	@Override
	public void addAddition() {
		cocktail.setAddition("sugar");
	}

}

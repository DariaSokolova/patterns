package com.epam.mentoring.patterns.creational.builder;

public abstract class CocktailBuilder {
	protected Cocktail cocktail;
	
	public void createCocktail() {
		cocktail = new Cocktail();
	}
	
	public Cocktail getCocktail() {
		return cocktail;
	}
	
	public abstract void addAlcohol();
	public abstract void addDrink();
	public abstract void addAddition();
}

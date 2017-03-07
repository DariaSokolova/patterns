package com.epam.mentoring.patterns.creational.builder;

public class Cocktail {
	private String alcohol;
	private String drink;
	private String addition;
	
	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public void setAddition(String addition) {
		this.addition = addition;
	}

	public String getAlcohol() {
		return alcohol;
	}

	public String getDrink() {
		return drink;
	}

	public String getAddition() {
		return addition;
	}
}

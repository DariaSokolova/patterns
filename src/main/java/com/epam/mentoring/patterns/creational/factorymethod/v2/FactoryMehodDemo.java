package com.epam.mentoring.patterns.creational.factorymethod.v2;

import com.epam.mentoring.patterns.creational.factorymethod.product.Villain;

public class FactoryMehodDemo {
	VillainFactory factory = new VillainFactory();
	
	public Villain createVillain(int villainnID) {
		Villain villainn = factory.createVillain(villainnID);
		return villainn;
	}
}

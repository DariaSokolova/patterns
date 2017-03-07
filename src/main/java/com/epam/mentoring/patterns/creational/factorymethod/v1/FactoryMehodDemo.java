package com.epam.mentoring.patterns.creational.factorymethod.v1;

import com.epam.mentoring.patterns.creational.factorymethod.product.Villain;

public class FactoryMehodDemo {
	
	public Villain createVillain(VillainCreator creator) {
		Villain villainn = creator.createVillain();
		return villainn;
	}
}

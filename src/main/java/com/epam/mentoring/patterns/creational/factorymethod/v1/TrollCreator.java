package com.epam.mentoring.patterns.creational.factorymethod.v1;

import com.epam.mentoring.patterns.creational.factorymethod.product.Troll;
import com.epam.mentoring.patterns.creational.factorymethod.product.Villain;

public class TrollCreator implements VillainCreator {

	public Villain createVillain() {
		return new Troll();
	}

}

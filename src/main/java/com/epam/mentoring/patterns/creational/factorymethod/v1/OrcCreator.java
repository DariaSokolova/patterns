package com.epam.mentoring.patterns.creational.factorymethod.v1;

import com.epam.mentoring.patterns.creational.factorymethod.product.Orc;
import com.epam.mentoring.patterns.creational.factorymethod.product.Villain;

public class OrcCreator implements VillainCreator {

	public Villain createVillain() {
		return new Orc();
	}
}

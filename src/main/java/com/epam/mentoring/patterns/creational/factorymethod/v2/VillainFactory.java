package com.epam.mentoring.patterns.creational.factorymethod.v2;

import com.epam.mentoring.patterns.creational.factorymethod.product.Orc;
import com.epam.mentoring.patterns.creational.factorymethod.product.Troll;
import com.epam.mentoring.patterns.creational.factorymethod.product.Villain;

public class VillainFactory {
	public static final int ORC_ID = 1;
	public static final int TROLL_ID = 2;
	
	public Villain createVillain(int villainID) {
		Villain villain = null;
		if (villainID == ORC_ID) {
			villain = new Orc();
		} else if (villainID == TROLL_ID) {
			villain = new Troll();
		}
		return villain;
	}
}

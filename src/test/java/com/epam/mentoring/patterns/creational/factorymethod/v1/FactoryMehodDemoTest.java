package com.epam.mentoring.patterns.creational.factorymethod.v1;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

import com.epam.mentoring.patterns.creational.factorymethod.product.Orc;
import com.epam.mentoring.patterns.creational.factorymethod.product.Troll;
import com.epam.mentoring.patterns.creational.factorymethod.product.Villain;

public class FactoryMehodDemoTest {
	private FactoryMehodDemo demo = new FactoryMehodDemo();

	@Test
	public void testCreateVillain_CreateOrc() {
		VillainCreator creator = new OrcCreator();
		Villain villain = demo.createVillain(creator);
		
		assertThat(villain, instanceOf(Orc.class));
	}

	@Test
	public void testCreateVillain_CreateTroll() {
		VillainCreator creator = new TrollCreator();
		Villain villain = demo.createVillain(creator);
		
		assertThat(villain, instanceOf(Troll.class));
	}
}

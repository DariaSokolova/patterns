package com.epam.mentoring.patterns.creational.factorymethod.v2;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertNull;
import static org.hamcrest.CoreMatchers.instanceOf;

import com.epam.mentoring.patterns.creational.factorymethod.product.Orc;
import com.epam.mentoring.patterns.creational.factorymethod.product.Troll;
import com.epam.mentoring.patterns.creational.factorymethod.product.Villain;

public class FactoryMehodDemoTest {
	private FactoryMehodDemo demo = new FactoryMehodDemo();

	@Test
	public void testCreateVillain_CreateOrc() {
		Villain villain = demo.createVillain(VillainFactory.ORC_ID);
		
		assertThat(villain, instanceOf(Orc.class));
	}

	@Test
	public void testCreateVillain_CreateTroll() {
		Villain villain = demo.createVillain(VillainFactory.TROLL_ID);
		
		assertThat(villain, instanceOf(Troll.class));
	}

	@Test
	public void testCreateVillain_UNspecified() {
		Villain villain = demo.createVillain(-1);
		
		assertNull(villain);
	}
}

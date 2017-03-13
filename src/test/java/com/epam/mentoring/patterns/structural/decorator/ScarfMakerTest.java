package com.epam.mentoring.patterns.structural.decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ScarfMakerTest {
	
	@Test
	public void knit_SnoodWithFringe() {
		ScarfMaker snoodMaker = new SnoodMaker();
		ScarfMaker snoodMakerWithFringe = new FringeDecorator(snoodMaker);
		
		snoodMakerWithFringe.knit();
		
		assertTrue(snoodMakerWithFringe.isKnitted());
		assertEquals(snoodMakerWithFringe.getType(), "snood");
		assertTrue(snoodMakerWithFringe.getAttributes().contains("fringe"));
	}
	
	@Test
	public void knit_StoleWithFringe() {
		ScarfMaker stoleMaker = new StoleMaker();
		ScarfMaker stoleMakerWithFringe = new FringeDecorator(stoleMaker);
		
		stoleMakerWithFringe.knit();
		
		assertTrue(stoleMakerWithFringe.isKnitted());
		assertEquals(stoleMakerWithFringe.getType(), "stole");
		assertTrue(stoleMakerWithFringe.getAttributes().contains("fringe"));
	}
	@Test
	public void knit_SnoodWithPattern() {
		ScarfMaker snoodMaker = new SnoodMaker();
		ScarfMaker snoodMakerWithPattern = new PatternDecorator(snoodMaker);
		
		snoodMakerWithPattern.knit();
		
		assertTrue(snoodMakerWithPattern.isKnitted());
		assertEquals(snoodMakerWithPattern.getType(), "snood");
		assertTrue(snoodMakerWithPattern.getAttributes().contains("pattern"));
	}
	
	@Test
	public void knit_StoleWithPattern() {
		ScarfMaker stoleMaker = new StoleMaker();
		ScarfMaker stoleMakerWithPattern = new PatternDecorator(stoleMaker);
		
		stoleMakerWithPattern.knit();
		
		assertTrue(stoleMakerWithPattern.isKnitted());
		assertEquals(stoleMakerWithPattern.getType(), "stole");
		assertTrue(stoleMakerWithPattern.getAttributes().contains("pattern"));
	}
}

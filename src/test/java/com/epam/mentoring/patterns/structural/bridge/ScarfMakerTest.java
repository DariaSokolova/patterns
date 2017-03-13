package com.epam.mentoring.patterns.structural.bridge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScarfMakerTest {
	
	@Test
	public void knit_SnoodWithFringe() {
		ScarfAPI api = new FrindgeAPI();
		ScarfMaker maker = new SnoodMaker(api);
		
		String result = maker.knit();
		
		assertEquals(result, "frindge");
	}
	
	@Test
	public void knit_SnoodWithPattern() {
		ScarfAPI api = new PatternAPI();
		ScarfMaker maker = new SnoodMaker(api);
		
		String result = maker.knit();
		
		assertEquals(result, "pattern");
	}
}

package com.epam.mentoring.patterns.structural.adater;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.epam.mentoring.patterns.structural.adapter.PCPlayer;
import com.epam.mentoring.patterns.structural.adapter.v1.VinylPlayerAdapter;

public class VinylPlayerAdapterTest {
	
	@Test
	public void testGetDigitalSound() {
		PCPlayer player = new VinylPlayerAdapter();
		String result = player.getDigitalSound();
		
		assertEquals("digital", result);
	}
}

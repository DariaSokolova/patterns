package com.epam.mentoring.patterns.structural.adapter.v2;

import com.epam.mentoring.patterns.structural.adapter.PCPlayer;
import com.epam.mentoring.patterns.structural.adapter.VinylPlayer;

//Adapter
public class VinylPlayerAdapter implements PCPlayer {
	
	private VinylPlayer player;
	
	public VinylPlayerAdapter() {
		player = new VinylPlayer();
	}
	
	@Override
	public String getDigitalSound() {
		String analog = player.getAnalogSound();
		String digital = convertAnalogToDigital(analog);
		return digital;
	}
	
	private String convertAnalogToDigital(String analog) {
		return "digital";
	}
}

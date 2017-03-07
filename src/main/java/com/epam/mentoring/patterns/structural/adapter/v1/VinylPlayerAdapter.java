package com.epam.mentoring.patterns.structural.adapter.v1;

import com.epam.mentoring.patterns.structural.adapter.PCPlayer;
import com.epam.mentoring.patterns.structural.adapter.VinylPlayer;

//Adapter
public class VinylPlayerAdapter extends VinylPlayer implements PCPlayer {
	
	@Override
	public String getDigitalSound() {
		String analog = getAnalogSound();
		String digital = convertAnalogToDigital(analog);
		return digital;
	}
	
	private String convertAnalogToDigital(String analog) {
		return "digital";
	}
}

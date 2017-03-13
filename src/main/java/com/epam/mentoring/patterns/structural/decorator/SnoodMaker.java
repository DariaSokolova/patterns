package com.epam.mentoring.patterns.structural.decorator;

public class SnoodMaker extends ScarfMaker {

	@Override
	public void knit() {
		knitted = true;
		type = "snood";
	}

}

package com.epam.mentoring.patterns.structural.decorator;

public class StoleMaker extends ScarfMaker {
	
	@Override
	public void knit() {	
		knitted = true;
		type = "stole";
	}

}

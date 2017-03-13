package com.epam.mentoring.patterns.structural.bridge;

//Abstraction
public abstract class ScarfMaker {
	protected ScarfAPI api;
	
	public ScarfMaker(ScarfAPI api) {
		this.api = api;
	}
	
	public abstract String knit();
}

package com.epam.mentoring.patterns.structural.bridge;

//RefinedAbstraction
public class SnoodMaker extends ScarfMaker {

	public SnoodMaker(ScarfAPI api) {
		super(api);
	}

	@Override
	public String knit() {
		return api.knitSnood();
	}
}

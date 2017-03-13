package com.epam.mentoring.patterns.structural.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class ScarfMaker {
	protected boolean knitted;
	protected String type;
	protected List<String> attributes;

	public ScarfMaker() {
		attributes = new ArrayList<>();
	}

	public abstract void knit();

	public boolean isKnitted() {
		return knitted;
	}

	public String getType() {
		return type;
	}

	public List<String> getAttributes() {
		return attributes;
	}	
}

package com.epam.mentoring.patterns.structural.facade;

public class Director {
	private boolean shooted;

	public void shoot() {
		shooted = true;
	}

	protected boolean isShooted() {
		return shooted;
	}
}

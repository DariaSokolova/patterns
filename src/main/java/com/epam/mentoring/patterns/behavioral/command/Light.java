package com.epam.mentoring.patterns.behavioral.command;

public class Light {
	private boolean on;

	public void switchOn() {
		on = true;
	}

	public void switchOff() {
		on = false;
	}

	protected boolean isOn() {
		return on;
	}
}

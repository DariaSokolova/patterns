package com.epam.mentoring.patterns.behavioral.cof;

public class ConsoleLogger extends AbstractLogger {
	public static String NAME = "Console";

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		Logger.getLogger().write(NAME + ": " + message);
	}

}

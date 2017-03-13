package com.epam.mentoring.patterns.behavioral.cof;

public class ErrorLogger extends AbstractLogger {
	public static String NAME = "ErrorConsole";
	
	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		Logger.getLogger().write(NAME + ": " + message);
	}

}

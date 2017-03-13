package com.epam.mentoring.patterns.behavioral.cof;

public class FileLogger extends AbstractLogger {
	public static String NAME = "File";

	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		Logger.getLogger().write(NAME + ": " + message);
	}

}

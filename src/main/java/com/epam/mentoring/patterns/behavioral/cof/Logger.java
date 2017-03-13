package com.epam.mentoring.patterns.behavioral.cof;

public class Logger {
	private static Logger logger;
	private Logger() {}
	private String log = "";
	
	public static Logger getLogger() {
		if (logger == null) {
			logger = new Logger();
		}
		return logger;
	}
	
	public void write(String message) {
		log += message;
	}
	
	public String getLog() {
		return log;
	}
}

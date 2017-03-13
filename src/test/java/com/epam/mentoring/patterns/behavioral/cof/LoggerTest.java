package com.epam.mentoring.patterns.behavioral.cof;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoggerTest {
	private Client client = new Client();
	
	@Test
	public void testLogMessage_InfoLogger() {
		String message = "Information";
		
		AbstractLogger loggerChain = client.getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, message);    
		
		String log = Logger.getLogger().getLog();

		assertTrue(log.contains(message));
		assertTrue(log.contains(ConsoleLogger.NAME));
		assertFalse(log.contains(FileLogger.NAME));
		assertFalse(log.contains(ErrorLogger.NAME));
	}
	
	@Test
	public void testLogMessage_DebugLogger() {
		String message = "Debug";
		
		AbstractLogger loggerChain = client.getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.DEBUG, message);    
		
		String log = Logger.getLogger().getLog();

		assertTrue(log.contains(message));
		assertTrue(log.contains(ConsoleLogger.NAME));
		assertTrue(log.contains(FileLogger.NAME));
		assertFalse(log.contains(ErrorLogger.NAME));
	}
	
	@Test
	public void testLogMessage_ErrorLogger() {
		String message = "Error";
		
		AbstractLogger loggerChain = client.getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.DEBUG, message);    
		
		String log = Logger.getLogger().getLog();

		assertTrue(log.contains(message));
		assertTrue(log.contains(ConsoleLogger.NAME));
		assertTrue(log.contains(FileLogger.NAME));
		assertTrue(log.contains(ErrorLogger.NAME));
	}
}

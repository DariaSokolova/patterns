package com.epam.mentoring.patterns.behavioral.templatemethod;

public class DataObject {
	private String readData;
	private String processedData;

	protected String getReadData() {
		return readData;
	}

	protected void setReadData(String readData) {
		this.readData = readData;
	}

	protected String getProcessedData() {
		return processedData;
	}

	protected void setProcessedData(String processedData) {
		this.processedData = processedData;
	}
}

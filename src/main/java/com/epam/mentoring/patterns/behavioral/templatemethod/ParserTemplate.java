package com.epam.mentoring.patterns.behavioral.templatemethod;

public abstract class ParserTemplate {

	public final DataObject parseDocument(String document) {
		DataObject object = new DataObject();
		String data = readData(document);
		object.setReadData(data);
		String processedData = processData(data);
		object.setProcessedData(processedData);
		writeData(processedData);
		return object;
	}

	public abstract String readData(String document);

	public abstract String processData(String data);

	private void writeData(String processedData) {
		// default method
	}
}

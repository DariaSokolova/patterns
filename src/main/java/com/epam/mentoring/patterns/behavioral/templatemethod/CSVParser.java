package com.epam.mentoring.patterns.behavioral.templatemethod;

public class CSVParser extends ParserTemplate {
	public static final String NAME = "CSVParser";

	@Override
	public String readData(String document) {
		return NAME + ": read";

	}

	@Override
	public String processData(String data) {
		return NAME + ": processed";
	}

}

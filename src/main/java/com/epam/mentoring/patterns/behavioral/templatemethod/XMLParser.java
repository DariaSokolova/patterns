package com.epam.mentoring.patterns.behavioral.templatemethod;

public class XMLParser extends ParserTemplate {
	public static final String NAME = "XMLParser";

	@Override
	public String readData(String document) {
		return NAME + ": read";

	}

	@Override
	public String processData(String data) {
		return NAME + ": processed";
	}

}

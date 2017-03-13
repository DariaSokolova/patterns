package com.epam.mentoring.patterns.behavioral.templatemethod;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ParserTemplateTest {

	@Test
	public void testParseDocument_CSV() {
		ParserTemplate template = new CSVParser();
		
		DataObject object = template.parseDocument("file");
		
		assertTrue(object.getReadData().contains(CSVParser.NAME));
		assertTrue(object.getProcessedData().contains(CSVParser.NAME));
	}

	@Test
	public void testParseDocument_XML() {
		ParserTemplate template = new XMLParser();
		
		DataObject object = template.parseDocument("file");
		
		assertTrue(object.getReadData().contains(XMLParser.NAME));
		assertTrue(object.getProcessedData().contains(XMLParser.NAME));
	}
}

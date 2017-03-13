package com.epam.mentoring.patterns.structural.bridge;

//ConcreateImplementatorA
public class PatternAPI implements ScarfAPI {

	@Override
	public String knitSnood() {
		return "pattern";
	}

}

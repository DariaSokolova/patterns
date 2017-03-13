package com.epam.mentoring.patterns.structural.decorator;

public class PatternDecorator extends ScarfDecorator {

	public PatternDecorator(ScarfMaker scarfMaker) {
		super(scarfMaker);
	}

	@Override
	public void knit() {		
		scarfMaker.knit();
		this.knitted = scarfMaker.knitted;
		this.type = scarfMaker.type;
		addPattern();
	}
	
	private void addPattern() {
		attributes.add("pattern");
	}
	
}

package com.epam.mentoring.patterns.structural.decorator;

public class FringeDecorator extends ScarfDecorator {

	public FringeDecorator(ScarfMaker scarfMaker) {
		super(scarfMaker);
	}
	
	@Override
	public void knit() {		
		scarfMaker.knit();
		this.knitted = scarfMaker.knitted;
		this.type = scarfMaker.type;
		addFringe();
	}
	
	private void addFringe() {
		attributes.add("fringe");
	}
	
}

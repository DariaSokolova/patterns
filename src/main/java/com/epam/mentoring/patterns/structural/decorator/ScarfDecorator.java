package com.epam.mentoring.patterns.structural.decorator;

public abstract class ScarfDecorator extends ScarfMaker {
	protected ScarfMaker scarfMaker;

	public ScarfDecorator(ScarfMaker scarfMaker) {
		this.scarfMaker = scarfMaker;
	}
	
	@Override
	public void knit() {	
		scarfMaker.knit();
	}
}

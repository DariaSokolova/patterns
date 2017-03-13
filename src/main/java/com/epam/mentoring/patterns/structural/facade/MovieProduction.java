package com.epam.mentoring.patterns.structural.facade;

public class MovieProduction {
	private Director director;
	private Screenwriter screenwriter;
	private CastingDirector castingDirector;

	public MovieProduction() {
		director = new Director();
		screenwriter = new Screenwriter();
		castingDirector = new CastingDirector();
	}

	public boolean createMovie() {
		screenwriter.writeScript();
		castingDirector.cast();
		director.shoot();
		return screenwriter.isScriptWritten()
				&& castingDirector.isActorsCasted() && director.isShooted();
	}

}

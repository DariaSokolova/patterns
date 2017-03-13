package com.epam.mentoring.patterns.structural.facade;

public class CastingDirector {
	private boolean actorsCasted;
	
	public void cast() {
		actorsCasted = true;
	}

	protected boolean isActorsCasted() {
		return actorsCasted;
	}
}

package com.epam.mentoring.patterns.structural.facade;

public class Screenwriter {
	private boolean scriptWritten;
	
	public void writeScript() {
		scriptWritten = true;
	}

	protected boolean isScriptWritten() {
		return scriptWritten;
	}
}

package com.epam.mentoring.patterns.behavioral.memento;

public class Originator {
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void restoreState(Memento memento) {
		state = memento.getState();
	}
}

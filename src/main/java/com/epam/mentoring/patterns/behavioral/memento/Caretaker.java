package com.epam.mentoring.patterns.behavioral.memento;

public class Caretaker {
	private Memento memento;

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}
}

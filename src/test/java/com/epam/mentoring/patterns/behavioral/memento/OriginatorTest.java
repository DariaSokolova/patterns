package com.epam.mentoring.patterns.behavioral.memento;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class OriginatorTest {
	private Caretaker caretaker = new Caretaker();
	private Originator originator = new Originator();

	@Test
	public void testSaveStateToMemento_Saved() {
		String state  = "state";
		originator.setState(state);
		
		caretaker.setMemento(originator.saveStateToMemento());
		
		assertEquals(state, originator.getState());
	}
	
	@Test
	public void testSaveStateToMemento_NotSaved() {		
		caretaker.setMemento(originator.saveStateToMemento());
		
		assertNull(originator.getState());
	}
	
	@Test
	public void testRestoreState() {		
		String state1  = "state1";	
		originator.setState(state1);
		caretaker.setMemento(originator.saveStateToMemento());
		String state2  = "state2";
		originator.setState(state2);
		caretaker.setMemento(originator.saveStateToMemento());
		
		originator.restoreState(caretaker.getMemento());
		
		assertEquals(state2, originator.getState());
	}
}

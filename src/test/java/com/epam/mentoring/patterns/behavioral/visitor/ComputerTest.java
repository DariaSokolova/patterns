package com.epam.mentoring.patterns.behavioral.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComputerTest {
	private ComputerPart computer = new Computer();

	@Test
	public void testAccept_DisplayVisitor() {
		ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

		computer.accept(visitor);

		assertEquals(ComputerPartDisplayVisitor.COMPUTER_VISIT, DataObject
				.getDataObject().getVisitComputer());
		assertEquals(ComputerPartDisplayVisitor.MOUSE_VISIT, DataObject
				.getDataObject().getVisitMouse());
		assertEquals(ComputerPartDisplayVisitor.KEYBOARD_VISIT, DataObject
				.getDataObject().getVisitKeyboard());
		assertEquals(ComputerPartDisplayVisitor.MONITOR_VISIT, DataObject
				.getDataObject().getVisitMonitor());
	}

	@Test
	public void testAccept_PlugInVisitor() {
		ComputerPartVisitor visitor = new ComputerPartPlugInVisitor();

		computer.accept(visitor);

		assertEquals(ComputerPartPlugInVisitor.COMPUTER_VISIT, DataObject
				.getDataObject().getVisitComputer());
		assertEquals(ComputerPartPlugInVisitor.MOUSE_VISIT, DataObject
				.getDataObject().getVisitMouse());
		assertEquals(ComputerPartPlugInVisitor.KEYBOARD_VISIT, DataObject
				.getDataObject().getVisitKeyboard());
		assertEquals(ComputerPartPlugInVisitor.MONITOR_VISIT, DataObject
				.getDataObject().getVisitMonitor());
	}
}

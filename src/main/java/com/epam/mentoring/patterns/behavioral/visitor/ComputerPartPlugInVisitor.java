package com.epam.mentoring.patterns.behavioral.visitor;

public class ComputerPartPlugInVisitor implements ComputerPartVisitor {
	public static final String COMPUTER_VISIT = "Turn on the computer";
	public static final String MOUSE_VISIT = "Plug-in the mouse";
	public static final String KEYBOARD_VISIT = "Plug-in the keyboard";
	public static final String MONITOR_VISIT = "Plug-in the monitor";
	
	
	@Override
	public void visit(Computer computer) {
		DataObject.getDataObject().setVisitComputer(COMPUTER_VISIT);
	}

	@Override
	public void visit(Mouse mouse) {
		DataObject.getDataObject().setVisitMouse(MOUSE_VISIT);
	}

	@Override
	public void visit(Keyboard keyboard) {
		DataObject.getDataObject().setVisitKeyboard(KEYBOARD_VISIT);
	}

	@Override
	public void visit(Monitor monitor) {
		DataObject.getDataObject().setVisitMonitor(MONITOR_VISIT);
	}

}

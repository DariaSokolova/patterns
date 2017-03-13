package com.epam.mentoring.patterns.behavioral.visitor;

public class DataObject {
	private static DataObject object;
	private DataObject() {}
	
	public static DataObject getDataObject() {
		if (object == null) {
			object = new DataObject();
		}
		return object;
	}
	
	private String visitComputer;
	private String visitMouse;
	private String visitKeyboard;
	private String visitMonitor;
	
	protected String getVisitComputer() {
		return visitComputer;
	}
	protected void setVisitComputer(String visitComputer) {
		this.visitComputer = visitComputer;
	}
	protected String getVisitMouse() {
		return visitMouse;
	}
	protected void setVisitMouse(String visitMouse) {
		this.visitMouse = visitMouse;
	}
	protected String getVisitKeyboard() {
		return visitKeyboard;
	}
	protected void setVisitKeyboard(String visitKeyboard) {
		this.visitKeyboard = visitKeyboard;
	}
	protected String getVisitMonitor() {
		return visitMonitor;
	}
	protected void setVisitMonitor(String visitMonitor) {
		this.visitMonitor = visitMonitor;
	}
}

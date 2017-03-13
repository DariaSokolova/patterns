package com.epam.mentoring.patterns.structural.composite;

public abstract class Employee {
	protected String position;
	
	public Employee(String position) {
		this.position = position;
	}
	
	public abstract void addEmployee(Employee employee);
	public abstract void removeEmployee(Employee employee);
	public abstract Employee getChield(int index);

	public abstract String getInfo();
}

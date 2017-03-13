package com.epam.mentoring.patterns.structural.composite;

public class OrdinaryEmployee extends Employee {

	public OrdinaryEmployee(String position) {
		super(position);
	}

	@Override
	public String getInfo() {
		return position;
	}
	
	@Override
	public void addEmployee(Employee employee) {
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}

	@Override
	public void removeEmployee(Employee employee) {
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}

	@Override
	public Employee getChield(int index) {
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}

	
}

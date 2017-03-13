package com.epam.mentoring.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
	
	public Manager(String position) {
		super(position);
		employees = new ArrayList<>();
	}

	private List<Employee> employees;
	
	@Override
	public String getInfo() {
		return position;		
	}

	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	@Override
	public Employee getChield(int index) {
		return employees.size() > index ? employees.get(index) : null;
	}

}

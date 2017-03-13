package com.epam.mentoring.patterns.behavioral.iterator;

public interface Iterator {
	public boolean hasNext();
	public Object next();
	public Object first();
	public Object current();
}

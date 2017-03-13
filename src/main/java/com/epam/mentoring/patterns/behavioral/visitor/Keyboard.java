package com.epam.mentoring.patterns.behavioral.visitor;

public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	}

}

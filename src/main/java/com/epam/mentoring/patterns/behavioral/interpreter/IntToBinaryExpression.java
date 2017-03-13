package com.epam.mentoring.patterns.behavioral.interpreter;

public class IntToBinaryExpression implements Expression {
	private int number;

	public IntToBinaryExpression(int number) {
		this.number = number;
	}

	@Override
	public String interpret(InterpreterContext context) {
		return context.getBinaryFormat(number);
	}

}

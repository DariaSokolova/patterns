package com.epam.mentoring.patterns.behavioral.interpreter;

public class IntToHexExpression implements Expression {

	private int number;

	public IntToHexExpression(int number) {
		this.number = number;
	}

	@Override
	public String interpret(InterpreterContext context) {
		return context.getHexadecimalFormat(number);
	}
}

package com.epam.mentoring.patterns.behavioral.interpreter;

public class InterpreterClient {
	public InterpreterContext context;

	public InterpreterClient(InterpreterContext context) {
		this.context = context;
	}

	public String interpret(String str) {
		Expression exp = null;
		
		if (str.contains("Hexadecimal")) {
			exp = new IntToHexExpression(Integer.parseInt(str.substring(0,
					str.indexOf(" "))));
		} else if (str.contains("Binary")) {
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0,
					str.indexOf(" "))));
		} else
			return str;

		return exp.interpret(context);
	}
}

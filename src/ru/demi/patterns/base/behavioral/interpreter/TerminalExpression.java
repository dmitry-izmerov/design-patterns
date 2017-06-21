package ru.demi.patterns.base.behavioral.interpreter;

public class TerminalExpression implements Expression {
	private String value;

	public TerminalExpression(String value) {
		this.value = value;
	}

	@Override
	public boolean execute(String context) {
		return context.toLowerCase().contains(value.toLowerCase());
	}
}

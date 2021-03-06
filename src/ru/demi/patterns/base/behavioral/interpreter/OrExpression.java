package ru.demi.patterns.base.behavioral.interpreter;

public class OrExpression implements Expression {
	Expression expression1;
	Expression expression2;

	public OrExpression(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public boolean execute(String context) {
		return expression1.execute(context) || expression2.execute(context);
	}
}

package ru.demi.patterns.base.structural.flyweight;

public class UsualSymbol extends Symbol {

	public UsualSymbol(char value) {
		super(value);
	}

	@Override
	char getValue() {
		return value;
	}
}

package ru.demi.patterns.base.structural.flyweight;

public abstract class Symbol {
	protected char value;

	public Symbol(char value) {
		this.value = value;
	}

	abstract char getValue();
}

package ru.demi.patterns.base.structural.flyweight;

public class App {
	public static void main(String[] args) {
		SymbolFactory symbolFactory = new SymbolFactory();
		Symbol a = symbolFactory.getSymbol("a");
		Symbol b = symbolFactory.getSymbol("b");
		Symbol c = symbolFactory.getSymbol("c");

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(a.getValue())
			.append(b.getValue())
			.append(c.getValue());
		System.out.println(stringBuilder);
	}
}

package ru.demi.patterns.base.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
public class SymbolFactory {
	private static Map<String, Symbol> symbols = new HashMap<>();

	public Symbol getSymbol(String symbol) {
		if (!symbols.containsKey(symbol)) {
			UsualSymbol result = new UsualSymbol(symbol.charAt(0));
			symbols.put(symbol, result);
			return result;
		}
		return symbols.get(symbol);
	}
}

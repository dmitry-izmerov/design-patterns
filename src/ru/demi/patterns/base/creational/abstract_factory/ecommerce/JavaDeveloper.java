package ru.demi.patterns.base.creational.abstract_factory.ecommerce;

import ru.demi.patterns.base.creational.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
	@Override
	public void writeCode() {
		System.out.println("writing java code...");
	}
}

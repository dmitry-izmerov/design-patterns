package ru.demi.patterns.base.creational.factory_method;

public class JavaDeveloperFactory implements DeveloperFactory {
	@Override
	public Developer createDeveloper() {
		return new JavaDeveloper();
	}
}

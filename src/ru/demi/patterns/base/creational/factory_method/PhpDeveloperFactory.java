package ru.demi.patterns.base.creational.factory_method;

public class PhpDeveloperFactory implements DeveloperFactory {
	@Override
	public Developer createDeveloper() {
		return new PhpDeveloper();
	}
}

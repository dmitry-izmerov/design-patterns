package ru.demi.patterns.base.creational.factory_method;

public class App {
	public static void main(String[] args) {
		DeveloperFactory developerFactory = createDeveloperFactoryByType("php");
		Developer developer = developerFactory.createDeveloper();
		developer.writeCode();
	}

	static DeveloperFactory createDeveloperFactoryByType(String type) {
		switch (DeveloperFactoryType.valueOf(type.toUpperCase())) {
			case JAVA:
				return new JavaDeveloperFactory();
			case PHP:
				return new PhpDeveloperFactory();
			default:
				throw new IllegalArgumentException(type + " is unknown type.");
		}
	}
}

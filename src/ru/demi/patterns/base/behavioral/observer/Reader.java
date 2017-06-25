package ru.demi.patterns.base.behavioral.observer;

public class Reader implements Observer {
	private String name;

	public Reader(String name) {
		this.name = name;
	}

	@Override
	public void handle(String message) {
		System.out.printf("%s is reading news -> %s%n", name, message);
	}
}

package ru.demi.patterns.base.structural.bridge;

public class JavaDeveloper implements Developer {
	@Override
	public void develop() {
		System.out.println("Java developer is developing...");
	}
}

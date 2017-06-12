package ru.demi.patterns.base.structural.bridge;

public class PhpDeveloper implements Developer {
	@Override
	public void develop() {
		System.out.println("php developer is developing...");
	}
}

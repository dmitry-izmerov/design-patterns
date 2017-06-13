package ru.demi.patterns.base.structural.composite;

public class Slave implements Arbeitenable {
	@Override
	public void arbeiten() {
		System.out.println("a slave is working ...");
	}
}

package ru.demi.patterns.base.structural.bridge;

public class EnterpiseSite extends Project {

	public EnterpiseSite(Developer developer) {
		super(developer);
	}

	@Override
	public void develop() {
		System.out.println("enterprise site is being developed");
		developer.develop();
	}
}

package ru.demi.patterns.base.structural.bridge;

public class ShopProject extends Project {

	public ShopProject(Developer developer) {
		super(developer);
	}

	@Override
	public void develop() {
		System.out.println("shop project is being developed");
		developer.develop();
	}
}

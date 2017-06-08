package ru.demi.patterns.base.creational.builder;

public abstract class HouseBuilder {
	House house;

	public HouseBuilder build() {
		house = new House();
		return this;
	}

	public House get() {
		return house;
	}

	public abstract HouseBuilder storeysNumber();
	public abstract HouseBuilder roomsNumber();
	public abstract HouseBuilder location();
}

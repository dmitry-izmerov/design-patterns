package ru.demi.patterns.base.creational.builder;

public class EliteHouseBulder extends HouseBuilder {
	@Override
	public HouseBuilder storeysNumber() {
		house.setStoreysNumber(3);
		return this;
	}

	@Override
	public HouseBuilder roomsNumber() {
		house.setRoomsNumber(30);
		return this;
	}

	@Override
	public HouseBuilder location() {
		house.setLocation("Rublevka");
		return this;
	}
}

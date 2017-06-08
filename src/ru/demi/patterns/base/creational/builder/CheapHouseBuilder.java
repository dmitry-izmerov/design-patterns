package ru.demi.patterns.base.creational.builder;

public class CheapHouseBuilder extends HouseBuilder {
	@Override
	public HouseBuilder storeysNumber() {
		house.setStoreysNumber(1);
		return this;
	}

	@Override
	public HouseBuilder roomsNumber() {
		house.setRoomsNumber(5);
		return this;
	}

	@Override
	public HouseBuilder location() {
		house.setLocation("Russia");
		return this;
	}
}

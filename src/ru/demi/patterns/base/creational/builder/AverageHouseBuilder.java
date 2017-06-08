package ru.demi.patterns.base.creational.builder;

public class AverageHouseBuilder extends HouseBuilder {
	@Override
	public HouseBuilder storeysNumber() {
		house.setStoreysNumber(2);
		return this;
	}

	@Override
	public HouseBuilder roomsNumber() {
		house.setRoomsNumber(10);
		return this;
	}

	@Override
	public HouseBuilder location() {
		house.setLocation("Moscow region");
		return this;
	}
}

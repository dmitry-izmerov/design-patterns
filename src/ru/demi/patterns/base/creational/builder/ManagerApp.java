package ru.demi.patterns.base.creational.builder;

public class ManagerApp {
	public static void main(String[] args) {
		HouseBuilder houseBuilder = new EliteHouseBulder();
		House house = houseBuilder
			.build()
			.storeysNumber()
			.roomsNumber()
			.location()
			.get();

		System.out.println(house);
	}
}

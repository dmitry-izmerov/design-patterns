package ru.demi.patterns.base.creational.builder;

public class House {
	private int storeysNumber;
	private int roomsNumber;
	private String location;

	public void setStoreysNumber(int storeysNumber) {
		this.storeysNumber = storeysNumber;
	}

	public void setRoomsNumber(int roomsNumber) {
		this.roomsNumber = roomsNumber;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "House{" +
			"storeysNumber=" + storeysNumber +
			", roomsNumber=" + roomsNumber +
			", location='" + location + '\'' +
			'}';
	}
}

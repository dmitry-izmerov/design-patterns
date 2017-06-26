package ru.demi.patterns.base.behavioral.state;

public class AircraftInRecycling implements AircraftState {
	@Override
	public void handle(Aircraft aircraft) {
		System.out.printf("Aircraft %s has been recycled.%n", aircraft.getName());
	}
}

package ru.demi.patterns.base.behavioral.state;

public class AircraftInUsing implements AircraftState {
	@Override
	public void handle(Aircraft aircraft) {
		System.out.printf("Aircraft %s has been used and went to recycling.%n", aircraft.getName());
		aircraft.setAircraftState(new AircraftInRecycling());
	}
}

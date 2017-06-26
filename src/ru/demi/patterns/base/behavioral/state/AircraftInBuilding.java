package ru.demi.patterns.base.behavioral.state;

public class AircraftInBuilding implements AircraftState {
	@Override
	public void handle(Aircraft aircraft) {
		System.out.printf("Aircraft %s has been built and is ready for using.%n", aircraft.getName());
		aircraft.setAircraftState(new AircraftInUsing());
	}
}

package ru.demi.patterns.base.behavioral.state;

public class AircraftInDesign implements AircraftState {
	@Override
	public void handle(Aircraft aircraft) {
		System.out.printf("Aircraft %s has been designed and is ready for building.%n", aircraft.getName());
		aircraft.setAircraftState(new AircraftInBuilding());
	}
}

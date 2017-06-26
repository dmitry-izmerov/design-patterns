package ru.demi.patterns.base.behavioral.state;

public class Aircraft {
	private String name;
	private AircraftState aircraftState;

	public Aircraft(String name, AircraftState aircraftState) {
		this.name = name;
		this.aircraftState = aircraftState;
	}

	public String getName() {
		return name;
	}

	public void setAircraftState(AircraftState aircraftState) {
		this.aircraftState = aircraftState;
	}

	public void requestState() {
		aircraftState.handle(this);
	}
}

package ru.demi.patterns.base.behavioral.state;

public class App {
	public static void main(String[] args) {
		Aircraft aircraft = new Aircraft("Tu-144", new AircraftInDesign());
		aircraft.requestState();
		aircraft.requestState();
		aircraft.requestState();
		aircraft.requestState();
	}
}

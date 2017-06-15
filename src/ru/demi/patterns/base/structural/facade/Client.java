package ru.demi.patterns.base.structural.facade;

public class Client {
	public static void main(String[] args) {
		SnackMachine snackMachine = new SnackMachine();
		snackMachine.getSnack("Alenka", 50);
	}
}

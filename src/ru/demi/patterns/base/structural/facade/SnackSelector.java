package ru.demi.patterns.base.structural.facade;

public class SnackSelector {

	public void selectSnack(SnackType snackType) {
		System.out.printf("Snack %s has been selected.%n", snackType);
	}
}

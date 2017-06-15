package ru.demi.patterns.base.structural.facade;

public class SnackMachine {
	private SnackSelector snackSelector = new SnackSelector();
	private SnackMover snackMover = new SnackMover();
	private Validator validator = new Validator();

	public void getSnack(String snackType, int money) {
		validator.validateMoney(money);
		snackSelector.selectSnack(SnackType.valueOf(snackType.toUpperCase()));
		snackMover.moveSnackToClient();
	}
}

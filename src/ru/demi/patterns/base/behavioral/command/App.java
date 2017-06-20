package ru.demi.patterns.base.behavioral.command;

public class App {
	public static void main(String[] args) {
		RemoteController remoteController = new RemoteController(new ConditionerCommand(new Conditioner()));
		remoteController.pressButton(Button.ON);
		remoteController.pressButton(Button.WORK);
		remoteController.pressButton(Button.OFF);
	}
}

package ru.demi.patterns.base.behavioral.command;

public class RemoteController {
	private Command command;

	public RemoteController(Command command) {
		this.command = command;
	}

	public void pressButton(Button button) {
		switch (button) {
			case ON:
				command.setUp();
				break;
			case OFF:
				command.turnDown();
				break;
			case WORK:
				command.execute();
				break;
			default:
				break;
		}
	}
}

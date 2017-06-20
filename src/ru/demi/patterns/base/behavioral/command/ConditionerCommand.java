package ru.demi.patterns.base.behavioral.command;

public class ConditionerCommand implements Command {
	Conditioner conditioner;

	public ConditionerCommand(Conditioner conditioner) {
		this.conditioner = conditioner;
	}

	@Override
	public void setUp() {
		conditioner.init();
	}

	@Override
	public void execute() {
		conditioner.work();
	}

	@Override
	public void turnDown() {
		conditioner.turnOff();
	}
}

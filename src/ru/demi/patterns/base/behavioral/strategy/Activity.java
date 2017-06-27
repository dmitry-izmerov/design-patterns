package ru.demi.patterns.base.behavioral.strategy;

public abstract class Activity {
	protected Man man;

	public Activity(Man man) {
		this.man = man;
	}

	abstract void execute();
}

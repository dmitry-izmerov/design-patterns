package ru.demi.patterns.base.behavioral.strategy;

public class Sleeping extends Activity {
	public Sleeping(Man man) {
		super(man);
	}

	@Override
	public void execute() {
		System.out.printf("%s is sleeping...%n", man.getName());
	}
}

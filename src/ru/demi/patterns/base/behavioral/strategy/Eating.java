package ru.demi.patterns.base.behavioral.strategy;

public class Eating extends Activity {
	public Eating(Man man) {
		super(man);
	}

	@Override
	void execute() {
		System.out.printf("%s is eating...%n", man.getName());
	}
}

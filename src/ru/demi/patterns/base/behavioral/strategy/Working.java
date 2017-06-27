package ru.demi.patterns.base.behavioral.strategy;

public class Working extends Activity {
	public Working(Man man) {
		super(man);
	}

	@Override
	void execute() {
		System.out.printf("%s is working...%n", man.getName());
	}
}

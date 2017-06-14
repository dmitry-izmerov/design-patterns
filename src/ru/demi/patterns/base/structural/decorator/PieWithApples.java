package ru.demi.patterns.base.structural.decorator;

public class PieWithApples extends PieDecorator {
	protected PieWithApples(Pie pie) {
		super(pie);
	}

	@Override
	public String cook() {
		return super.cook() + " and with apples";
	}
}

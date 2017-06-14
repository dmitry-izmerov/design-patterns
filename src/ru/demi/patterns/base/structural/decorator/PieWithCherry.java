package ru.demi.patterns.base.structural.decorator;

public class PieWithCherry extends PieDecorator {
	protected PieWithCherry(Pie pie) {
		super(pie);
	}

	@Override
	public String cook() {
		return super.cook() + " and with cherry";
	}
}

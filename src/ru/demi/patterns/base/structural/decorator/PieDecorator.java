package ru.demi.patterns.base.structural.decorator;

public abstract class PieDecorator implements Pie {

	private Pie pie;

	protected PieDecorator(Pie pie) {
		this.pie = pie;
	}

	@Override
	public String cook() {
		return pie.cook();
	}
}

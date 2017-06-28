package ru.demi.patterns.base.behavioral.template_method;

public class CurdMassWithDriedApricotsTechnology extends CurdMassTechnology {
	@Override
	protected void addComponents() {
		System.out.println("Add dried apricots in curd mass");
	}
}

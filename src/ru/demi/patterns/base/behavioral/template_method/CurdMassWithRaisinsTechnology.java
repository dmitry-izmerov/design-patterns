package ru.demi.patterns.base.behavioral.template_method;

public class CurdMassWithRaisinsTechnology extends CurdMassTechnology {
	@Override
	protected void addComponents() {
		System.out.println("Add raisins in curd mass");
	}
}

package ru.demi.patterns.base.behavioral.template_method;

public abstract class CurdMassTechnology {
	public void makeCurdMass() {
		System.out.println("Prepare curd basis");
		addComponents();
		System.out.println("Add final things");
	}

	protected abstract void addComponents();
}

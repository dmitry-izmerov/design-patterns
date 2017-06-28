package ru.demi.patterns.base.behavioral.template_method;

public class App {
	public static void main(String[] args) {
		CurdMassTechnology raisinsTechnology = new CurdMassWithRaisinsTechnology();
		CurdMassTechnology driedApricotsTechnology = new CurdMassWithDriedApricotsTechnology();

		raisinsTechnology.makeCurdMass();
		driedApricotsTechnology.makeCurdMass();
	}
}

package ru.demi.patterns.base.structural.composite;

public class Tsar {
	public static void main(String[] args) {
		Russia russia = new Russia();
		russia.bringUpSlave(new Slave());
		russia.bringUpSlave(new Slave());
		russia.bringUpSlave(new Slave());
		// ... millions of citizens

		russia.arbeiten();
	}
}

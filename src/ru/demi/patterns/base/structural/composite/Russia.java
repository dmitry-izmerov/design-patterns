package ru.demi.patterns.base.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Russia implements Arbeitenable {

	private List<Slave> slaves = new ArrayList<>();

	@Override
	public void arbeiten() {
		for (Arbeitenable slave : slaves) {
			slave.arbeiten();
		}
	}

	public void bringUpSlave(Slave slave) {
		slaves.add(slave);
	}

	public void punishSlave(Slave slave) {
		slaves.remove(slave);
	}
}

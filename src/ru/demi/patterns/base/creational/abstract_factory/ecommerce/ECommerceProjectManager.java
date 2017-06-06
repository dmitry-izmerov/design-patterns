package ru.demi.patterns.base.creational.abstract_factory.ecommerce;

import ru.demi.patterns.base.creational.abstract_factory.Manager;

public class ECommerceProjectManager implements Manager {
	@Override
	public void manageProject() {
		System.out.println("managing of ecommerce app...");
	}
}

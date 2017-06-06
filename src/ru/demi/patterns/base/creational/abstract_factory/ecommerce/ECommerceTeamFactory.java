package ru.demi.patterns.base.creational.abstract_factory.ecommerce;

import ru.demi.patterns.base.creational.abstract_factory.Developer;
import ru.demi.patterns.base.creational.abstract_factory.Manager;
import ru.demi.patterns.base.creational.abstract_factory.ProjectTeamFactory;
import ru.demi.patterns.base.creational.abstract_factory.Tester;

public class ECommerceTeamFactory implements ProjectTeamFactory {
	@Override
	public Developer getDeveloper() {
		return new JavaDeveloper();
	}

	@Override
	public Tester getTester() {
		return new QATester();
	}

	@Override
	public Manager getManager() {
		return new ECommerceProjectManager();
	}
}

package ru.demi.patterns.base.creational.abstract_factory;

import ru.demi.patterns.base.creational.abstract_factory.ecommerce.ECommerceTeamFactory;

public class EcommerceSite {
	public static void main(String[] args) {
		ProjectTeamFactory projectTeamFactory = new ECommerceTeamFactory();
		Developer developer = projectTeamFactory.getDeveloper();
		Tester tester = projectTeamFactory.getTester();
		Manager manager = projectTeamFactory.getManager();

		developer.writeCode();
		tester.testCode();
		manager.manageProject();
	}
}

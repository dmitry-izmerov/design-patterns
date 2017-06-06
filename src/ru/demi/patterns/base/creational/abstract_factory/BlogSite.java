package ru.demi.patterns.base.creational.abstract_factory;

import ru.demi.patterns.base.creational.abstract_factory.blog.WordpressTeamFactory;

public class BlogSite {
	public static void main(String[] args) {
		ProjectTeamFactory projectTeamFactory = new WordpressTeamFactory();
		Developer developer = projectTeamFactory.getDeveloper();
		Tester tester = projectTeamFactory.getTester();
		Manager manager = projectTeamFactory.getManager();

		developer.writeCode();
		tester.testCode();
		manager.manageProject();
	}
}

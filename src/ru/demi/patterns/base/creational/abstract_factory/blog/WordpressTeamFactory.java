package ru.demi.patterns.base.creational.abstract_factory.blog;

import ru.demi.patterns.base.creational.abstract_factory.Developer;
import ru.demi.patterns.base.creational.abstract_factory.Manager;
import ru.demi.patterns.base.creational.abstract_factory.ProjectTeamFactory;
import ru.demi.patterns.base.creational.abstract_factory.Tester;

public class WordpressTeamFactory implements ProjectTeamFactory {
	@Override
	public Developer getDeveloper() {
		return new WordpressDeveloper();
	}

	@Override
	public Tester getTester() {
		return new WordpressTester();
	}

	@Override
	public Manager getManager() {
		return new WordpressBlogManager();
	}
}

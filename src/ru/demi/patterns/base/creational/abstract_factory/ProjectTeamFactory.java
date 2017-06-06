package ru.demi.patterns.base.creational.abstract_factory;

public interface ProjectTeamFactory {
	Developer getDeveloper();
	Tester getTester();
	Manager getManager();
}

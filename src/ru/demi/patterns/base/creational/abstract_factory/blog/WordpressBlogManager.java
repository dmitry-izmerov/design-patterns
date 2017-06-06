package ru.demi.patterns.base.creational.abstract_factory.blog;

import ru.demi.patterns.base.creational.abstract_factory.Manager;

public class WordpressBlogManager implements Manager {
	@Override
	public void manageProject() {
		System.out.println("managing of blog...");
	}
}

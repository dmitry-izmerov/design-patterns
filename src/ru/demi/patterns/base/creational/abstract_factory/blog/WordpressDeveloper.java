package ru.demi.patterns.base.creational.abstract_factory.blog;


import ru.demi.patterns.base.creational.abstract_factory.Developer;

public class WordpressDeveloper implements Developer {
	@Override
	public void writeCode() {
		System.out.println("adapting wordpress cms...");
	}
}

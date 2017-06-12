package ru.demi.patterns.base.structural.bridge;

public abstract class Project {
	protected Developer developer;

	public Project(Developer developer) {
		this.developer = developer;
	}

	public abstract void develop();
}

package ru.demi.patterns.base.creational.prototype;

public abstract class FutureAnimal {
	protected String kind;
	protected int weight;

	public FutureAnimal(String kind, int weight) {
		this.kind = kind;
		this.weight = weight;
	}

	public abstract <T extends FutureAnimal> T copy();
}

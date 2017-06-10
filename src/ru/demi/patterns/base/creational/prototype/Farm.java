package ru.demi.patterns.base.creational.prototype;

public class Farm<T extends FutureAnimal> {
	private T futureAnimal;

	public Farm(T futureAnimal) {
		this.futureAnimal = futureAnimal;
	}

	public T produce() {
		return futureAnimal.copy();
	}
}

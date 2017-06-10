package ru.demi.patterns.base.creational.prototype;

public class FuturePig extends FutureAnimal {


	public FuturePig(String kind, int weight) {
		super(kind, weight);
	}

	@Override
	public FuturePig copy() {
		return new FuturePig(kind, weight);
	}

	@Override
	public String toString() {
		return "FuturePig{" +
			"kind=" + kind +
			", weight='" + weight + '\'' +
			'}';
	}
}

package ru.demi.patterns.base.creational.prototype;

public class FutureCow extends FutureAnimal {

	public FutureCow(String kind, int weight) {
		super(kind, weight);
	}

	@Override
	public FutureCow copy() {
		return new FutureCow(kind, weight);
	}

	@Override
	public String toString() {
		return "FutureCow{" +
			"kind=" + kind +
			", weight='" + weight + '\'' +
			'}';
	}
}

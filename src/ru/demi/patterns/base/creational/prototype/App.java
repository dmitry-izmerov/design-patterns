package ru.demi.patterns.base.creational.prototype;

public class App {
	public static void main(String[] args) {
		FuturePig pig = new FuturePig("meat", 250);
		Farm<FuturePig> pigFarm = new Farm<>(pig);
		System.out.println(pigFarm.produce());
	}
}

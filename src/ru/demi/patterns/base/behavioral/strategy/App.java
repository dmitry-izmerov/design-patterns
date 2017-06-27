package ru.demi.patterns.base.behavioral.strategy;

public class App {
	public static void main(String[] args) {
		Man vasya = new Man("Vasya");
		vasya.setActivity(new Eating(vasya));
		vasya.doActivity();

		vasya.setActivity(new Working(vasya));
		vasya.doActivity();

		vasya.setActivity(new Sleeping(vasya));
		vasya.doActivity();
	}
}

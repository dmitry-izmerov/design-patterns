package ru.demi.patterns.base.behavioral.command;

public class Conditioner {

	void init() {
		System.out.println("init of conditioner...");
	}

	void work() {
		System.out.println("conditioner is conditioning");
	}

	void turnOff() {
		System.out.println("stopping of conditioner...");
	}
}

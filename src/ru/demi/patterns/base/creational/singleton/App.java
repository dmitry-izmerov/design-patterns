package ru.demi.patterns.base.creational.singleton;

public class App {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start");

		Thread thread1 = new Thread(() -> HeavyConnection.getHeavyConnection().sendInfo("Info from thread 1"));
		thread1.start();

		Thread thread2 = new Thread(() -> HeavyConnection.getHeavyConnection().sendInfo("Info from thread 2"));
		thread2.start();

		HeavyConnection.getHeavyConnection().sendInfo("Info from main thread");

		thread1.join();
		thread2.join();

		System.out.println("Finish");
	}
}

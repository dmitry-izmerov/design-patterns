package ru.demi.patterns.base.creational.singleton;

public class HeavyConnection {

	private static HeavyConnection instance;

	private HeavyConnection() {}

	public static synchronized HeavyConnection getHeavyConnection() {
		if (instance == null) {
			instance = new HeavyConnection();
		}
		return instance;
	}

	public synchronized void sendInfo(String info) {
		System.out.println("It was sent info: " + info);
	}
}

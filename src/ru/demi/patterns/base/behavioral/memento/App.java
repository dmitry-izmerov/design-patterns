package ru.demi.patterns.base.behavioral.memento;

public class App {
	public static void main(String[] args) {
		Player player = new Player();
		GameSaver gameSaver = new GameSaver();

		player.action();
		player.action();
		player.action();
		System.out.printf("before saving: %s%n", player.getState());
		gameSaver.save(player.getState());
		player.action();
		player.action();
		System.out.printf("before restoring: %s%n", player.getState());
		player.restoreState(gameSaver.load());
		System.out.printf("after restoring: %s%n", player.getState());
	}
}

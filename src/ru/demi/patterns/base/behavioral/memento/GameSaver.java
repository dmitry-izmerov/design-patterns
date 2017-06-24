package ru.demi.patterns.base.behavioral.memento;

public class GameSaver {

	private PlayerState playerState;

	public void save(PlayerState state) {
		playerState = state;
	}

	public PlayerState load() {
		return playerState;
	}
}

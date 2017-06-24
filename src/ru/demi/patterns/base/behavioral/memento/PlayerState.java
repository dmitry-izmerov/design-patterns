package ru.demi.patterns.base.behavioral.memento;

public class PlayerState {
	private int points;

	public PlayerState(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "PlayerState{" +
			"points=" + points +
			'}';
	}

	public int getPoints() {
		return points;
	}
}

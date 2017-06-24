package ru.demi.patterns.base.behavioral.memento;

import java.util.Random;

public class Player {

	private int points;
	private Random random = new Random();

	public void action() {
		if (random.nextInt(10) % 2 == 0 || points == 0) {
			++points;
		} else {
			--points;
		}
	}

	public PlayerState getState() {
		return new PlayerState(points);
	}

	public void restoreState(PlayerState playerState) {
		points = playerState.getPoints();
	}
}

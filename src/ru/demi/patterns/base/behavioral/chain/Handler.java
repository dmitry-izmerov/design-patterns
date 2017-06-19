package ru.demi.patterns.base.behavioral.chain;

public abstract class Handler {
	protected Handler next;

	public Handler() {
	}

	public Handler(Handler next) {
		this.next = next;
	}

	abstract void handle(Request request);
}

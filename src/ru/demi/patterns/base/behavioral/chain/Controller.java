package ru.demi.patterns.base.behavioral.chain;

public class Controller extends Handler {

	public Controller(Handler next) {
		super(next);
	}

	@Override
	void handle(Request request) {
		System.out.printf("Controller has got message=%s", request.body);
	}
}

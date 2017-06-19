package ru.demi.patterns.base.behavioral.chain;

import java.util.HashSet;
import java.util.Set;

public class AuthenticationFilter extends Handler {
	private Set<String> users = new HashSet<>();

	{
		users.add("Sam");
		users.add("Pablo");
		users.add("Ivan");
	}

	public AuthenticationFilter(Handler next) {
		super(next);
	}

	@Override
	void handle(Request request) {
		if (!users.contains(request.user)) {
			return;
		}

		if (next != null) {
			next.handle(request);
		}
	}
}

package ru.demi.patterns.base.behavioral.chain;

import java.util.HashSet;
import java.util.Set;

public class BlackListFilter extends Handler {
	private Set<String> blackList = new HashSet<>();

	{
		blackList.add("1.1.1.1");
		blackList.add("5.5.5.5");
		blackList.add("18.18.18.18");
	}

	@Override
	void handle(Request request) {
		if (!blackList.contains(request.ip)) {
			return;
		}

		if (next != null) {
			next.handle(request);
		}
	}
}

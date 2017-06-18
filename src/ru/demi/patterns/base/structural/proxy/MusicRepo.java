package ru.demi.patterns.base.structural.proxy;

import java.util.Collection;

public abstract class MusicRepo {
	protected String url;

	public MusicRepo(String url) {
		this.url = url;
	}

	public abstract Collection<String> getRecords();
}

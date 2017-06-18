package ru.demi.patterns.base.structural.proxy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RealMusicRepo extends MusicRepo {
	private List<String> records = new ArrayList<>();

	public RealMusicRepo(String url) {
		super(url);
		reload();
	}

	public void reload() {
		System.out.printf("music records loading from url = %s...%n", url);
		records.add("Record1");
		records.add("Record2");
		records.add("Record3");
	}

	@Override
	public Collection<String> getRecords() {
		return records;
	}
}

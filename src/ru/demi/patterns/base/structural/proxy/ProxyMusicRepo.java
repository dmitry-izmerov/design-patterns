package ru.demi.patterns.base.structural.proxy;

import java.util.Collection;

public class ProxyMusicRepo extends MusicRepo {
	private MusicRepo musicRepo;

	public ProxyMusicRepo(String url) {
		super(url);
	}

	@Override
	public Collection<String> getRecords() {
		if (musicRepo == null) {
			musicRepo = new RealMusicRepo(url);
		}
		return musicRepo.getRecords();
	}
}

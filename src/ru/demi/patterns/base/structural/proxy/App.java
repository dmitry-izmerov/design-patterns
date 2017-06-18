package ru.demi.patterns.base.structural.proxy;

public class App {
	public static void main(String[] args) {
		MusicRepo musicRepo = new ProxyMusicRepo("http://music.repo/running wild");
		System.out.println(musicRepo.getRecords());
	}
}

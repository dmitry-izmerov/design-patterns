package ru.demi.patterns.base.behavioral.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NewsBlog implements Observable {
	private String url;
	private Set<Observer> observers = new HashSet<>();
	private List<String> newsList = new ArrayList<>();

	public NewsBlog(String url) {
		this.url = url;
	}

	public List<String> getNewsList() {
		return newsList;
	}

	public void publishNews(String news) {
		newsList.add(news);
		notifyObservers(news);
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(String message) {
		observers.forEach(observer -> observer.handle(String.format("%s (News is from %s)", message, url)));
	}
}

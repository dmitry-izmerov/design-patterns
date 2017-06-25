package ru.demi.patterns.base.behavioral.observer;

public interface Observable {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers(String message);
}

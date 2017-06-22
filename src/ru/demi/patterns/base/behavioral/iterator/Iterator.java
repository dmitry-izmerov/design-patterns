package ru.demi.patterns.base.behavioral.iterator;

public interface Iterator<T> {
	boolean hasNext();
	T getNext();
	void reset();
}

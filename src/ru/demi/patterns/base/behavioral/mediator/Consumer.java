package ru.demi.patterns.base.behavioral.mediator;

public interface Consumer {
	void getMessage(String message);
	void applyForProducts(String request);
}

package ru.demi.patterns.base.behavioral.mediator;

public class MediumConsumer implements Consumer {
	Shop shop;

	public MediumConsumer(Shop shop) {
		this.shop = shop;
	}

	@Override
	public void getMessage(String message) {
		System.out.printf("Consumer got message: %s.%n", message);
	}

	@Override
	public void applyForProducts(String request) {
		shop.processMessage(new Message(request, MessageType.CONSUMERS));
	}
}

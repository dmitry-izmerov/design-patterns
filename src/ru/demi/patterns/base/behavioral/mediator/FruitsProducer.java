package ru.demi.patterns.base.behavioral.mediator;

public class FruitsProducer implements Producer {
	Shop shop;

	public FruitsProducer(Shop shop) {
		this.shop = shop;
	}

	@Override
	public void getMessage(String message) {
		System.out.printf("Fruits producer got message: %s.%n", message);
	}

	@Override
	public void deliverProducts() {
		shop.processMessage(new Message("Fruits producer delivered products", MessageType.PRODUCERS));
	}
}

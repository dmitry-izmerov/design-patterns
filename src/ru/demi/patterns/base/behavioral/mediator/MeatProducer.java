package ru.demi.patterns.base.behavioral.mediator;

public class MeatProducer implements Producer {
	Shop shop;

	public MeatProducer(Shop shop) {
		this.shop = shop;
	}

	@Override
	public void getMessage(String message) {
		System.out.printf("meat producer got message: %s.%n", message);
	}

	@Override
	public void deliverProducts() {
		shop.processMessage(new Message("Meat producer delivered products", MessageType.PRODUCERS));

	}
}

package ru.demi.patterns.base.behavioral.mediator;

public class VegetablesProducer implements Producer {
	Shop shop;

	public VegetablesProducer(Shop shop) {
		this.shop = shop;
	}

	@Override
	public void getMessage(String message) {
		System.out.printf("Vegetables producer got message: %s.%n", message);
	}

	@Override
	public void deliverProducts() {
		shop.processMessage(new Message("Vegetables producer delivered products", MessageType.PRODUCERS));
	}
}

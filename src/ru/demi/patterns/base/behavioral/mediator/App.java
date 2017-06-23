package ru.demi.patterns.base.behavioral.mediator;

public class App {
	public static void main(String[] args) {
		OnlineShop shop = new OnlineShop();

		Producer meatProducer = new MeatProducer(shop);
		Producer vegetablesProducer = new VegetablesProducer(shop);
		Producer fruitsProducer = new FruitsProducer(shop);

		MediumConsumer consumer1 = new MediumConsumer(shop);
		MediumConsumer consumer2 = new MediumConsumer(shop);
		MediumConsumer consumer3 = new MediumConsumer(shop);

		shop.addConsumer(consumer1);
		shop.addConsumer(consumer2);
		shop.addConsumer(consumer3);
		shop.addProducer(meatProducer);
		shop.addProducer(vegetablesProducer);
		shop.addProducer(fruitsProducer);

		consumer1.applyForProducts("Meat is requested");
		consumer2.applyForProducts("Fruit is requested");
		consumer3.applyForProducts("Vegetable is requested");

		meatProducer.deliverProducts();
		vegetablesProducer.deliverProducts();
		fruitsProducer.deliverProducts();
	}
}

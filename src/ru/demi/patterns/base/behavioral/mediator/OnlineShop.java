package ru.demi.patterns.base.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OnlineShop implements Shop {
	List<Producer> producers = new ArrayList<>();
	List<Consumer> consumers = new ArrayList<>();

	public void addProducer(Producer producer) {
		producers.add(producer);
	}

	public void addConsumer(Consumer consumer) {
		consumers.add(consumer);
	}

	@Override
	public void processMessage(Message message) {
		if (message.messageType == MessageType.CONSUMERS) {
			String messageText = message.body.toLowerCase();
			if (messageText.contains("meat")) {
				getProducersByMessage(MeatProducer.class).forEach(producer -> producer.getMessage("Meat is needed"));
			} else if (messageText.contains("fruit")) {
				getProducersByMessage(FruitsProducer.class).forEach(producer -> producer.getMessage("Fruits are needed"));
			} else if (messageText.contains("vegetable")) {
				getProducersByMessage(VegetablesProducer.class).forEach(producer -> producer.getMessage("Vegetables are needed"));
			} else {
				// info logging
				System.out.printf("Message %s is without a suitable condition", message);
			}
		} else {
			consumers.forEach(consumer -> consumer.getMessage("Message from producer: " + message.body));
		}
	}

	private List<Producer> getProducersByMessage(Class<? extends Producer> clazz) {
		return producers.stream().filter(clazz::isInstance).collect(Collectors.toList());
	}
}

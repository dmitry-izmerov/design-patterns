package ru.demi.patterns.base.behavioral.mediator;

public class Message {
	String body;
	MessageType messageType;

	public Message(String body, MessageType messageType) {
		this.body = body;
		this.messageType = messageType;
	}

	@Override
	public String toString() {
		return "Message{" +
			"body='" + body + '\'' +
			", messageType=" + messageType +
			'}';
	}
}

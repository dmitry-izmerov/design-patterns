package ru.demi.patterns.base.behavioral.chain;

public class Request {
	String body;
	String ip;
	String user;

	public Request(String body, String ip, String user) {
		this.body = body;
		this.ip = ip;
		this.user = user;
	}
}

package ru.demi.patterns.base.behavioral.chain;

public class App {
	public static void main(String[] args) {
		Request request = new Request("hello to controller", "123.99.3.11", "Ivan");
		Controller controller = new Controller(new AuthenticationFilter(new BlackListFilter()));
		controller.handle(request);
	}
}

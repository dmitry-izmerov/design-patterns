package ru.demi.patterns.base.behavioral.observer;

public class App {
	public static void main(String[] args) {
		NewsBlog newsBlog = new NewsBlog("http://news.ru");
		Observer reader1 = new Reader("Ivan Ivanov");
		Observer reader2 = new Reader("Petr Petrov");

		newsBlog.addObserver(reader1);
		newsBlog.publishNews("news1");
		newsBlog.addObserver(reader2);
		newsBlog.publishNews("news2");
	}
}

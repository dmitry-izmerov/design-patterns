package ru.demi.patterns.base.behavioral.iterator;

public class App {
	public static void main(String[] args) {
		TodoList todoList = new TodoList("morning business", new String[]{"do exercises", "to wash up", "to have a breakfast"});
		Iterator<String> iterator = todoList.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.getNext());
		}
	}
}

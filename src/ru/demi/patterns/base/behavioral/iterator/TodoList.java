package ru.demi.patterns.base.behavioral.iterator;

public class TodoList implements Iterable<String> {
	private String name;
	private String[] todos;

	public TodoList(String name, String[] todos) {
		this.name = name;
		this.todos = todos;
	}

	@Override
	public Iterator<String> getIterator() {
		return new TodosIterator();
	}

	private class TodosIterator implements Iterator<String> {
		private int index;

		@Override
		public boolean hasNext() {
			if (index < todos.length) {
				return true;
			}
			return false;
		}

		@Override
		public String getNext() {
			if (index >= todos.length) {
				throw new ArrayIndexOutOfBoundsException();
			}
			return todos[index++];
		}

		@Override
		public void reset() {
			index = 0;
		}
	}
}

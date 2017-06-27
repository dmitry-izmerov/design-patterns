package ru.demi.patterns.base.behavioral.strategy;

public class Man {
	private String name;
	Activity activity;

	public Man(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public void doActivity() {
		activity.execute();
	}
}

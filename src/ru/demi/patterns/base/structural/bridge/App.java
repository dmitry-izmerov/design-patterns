package ru.demi.patterns.base.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Project> projects = new ArrayList<>();
		projects.add(new ShopProject(new PhpDeveloper()));
		projects.add(new EnterpiseSite(new JavaDeveloper()));

		for (Project project: projects) {
			project.develop();
		}
	}
}

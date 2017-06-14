package ru.demi.patterns.base.structural.decorator;

public class Baker {
	public static void main(String[] args) {
		Pie pie = new PieWithCherry(new PieWithApples(new BasePie()));
		System.out.println(pie.cook());
	}
}

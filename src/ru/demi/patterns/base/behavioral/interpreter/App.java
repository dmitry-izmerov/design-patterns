package ru.demi.patterns.base.behavioral.interpreter;

public class App {
	public static void main(String[] args) {
		String jsResume = "Js, Html, Css, Angular, React, VueJs, ember";
		String phpBackendResume = "php, patterns, algorithms, db, laravel, phalcon";

		Expression frontenderExp = new AndExpression(
			new AndExpression(new TerminalExpression("html"), new TerminalExpression("js")),
			new OrExpression(new TerminalExpression("ember"), new TerminalExpression("angular"))
		);

		Expression backenderExp = new AndExpression(
			new AndExpression(new TerminalExpression("php"), new TerminalExpression("db")),
			new OrExpression(new TerminalExpression("laravel"), new TerminalExpression("phalcon"))
		);

		System.out.printf("Is he frontender? - %b%n", frontenderExp.execute(jsResume));
		System.out.printf("Is he backender? - %b", backenderExp.execute(phpBackendResume));
	}
}

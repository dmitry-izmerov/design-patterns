package ru.demi.patterns.base.structural.adapter;

public class SuperLogger {
	void debug() {
		System.out.println("logging on debug level...");
	}
	void info() {
		System.out.println("logging on info level...");
	}
	void warn() {
		System.out.println("logging on warn level...");
	}
	void error() {
		System.out.println("logging on error level...");
	}
}

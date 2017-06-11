package ru.demi.patterns.base.structural.adapter;

public class App {
	public static void main(String[] args) {
		Logger logger = new AdapterLoggerToSuperLogger();
		logger.logDebug();
		logger.logInfo();
		logger.logWarn();
		logger.logError();
	}
}

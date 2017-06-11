package ru.demi.patterns.base.structural.adapter;

public class AdapterLoggerToSuperLogger extends SuperLogger implements Logger {
	@Override
	public void logDebug() {
		debug();
	}

	@Override
	public void logInfo() {
		info();
	}

	@Override
	public void logWarn() {
		warn();
	}

	@Override
	public void logError() {
		error();
	}
}

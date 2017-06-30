package ru.demi.patterns.base.behavioral.visitor;

public class StatisticalReport implements Report {

	@Override
	public void formattedBy(Formatter formatter) {
		formatter.format(this);
	}
}

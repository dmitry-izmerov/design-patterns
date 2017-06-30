package ru.demi.patterns.base.behavioral.visitor;

public class TaxReport implements Report {
	@Override
	public void formattedBy(Formatter formatter) {
		formatter.format(this);
	}
}

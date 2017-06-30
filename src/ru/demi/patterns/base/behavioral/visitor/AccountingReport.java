package ru.demi.patterns.base.behavioral.visitor;

public class AccountingReport implements Report {
	@Override
	public void formattedBy(Formatter formatter) {
		formatter.format(this);
	}
}

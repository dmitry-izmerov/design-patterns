package ru.demi.patterns.base.behavioral.visitor;

public interface Formatter {
	void format(StatisticalReport statisticalReport);
	void format(OperationalReport operationalReport);
	void format(AccountingReport accountingReport);
	void format(TaxReport taxReport);
}

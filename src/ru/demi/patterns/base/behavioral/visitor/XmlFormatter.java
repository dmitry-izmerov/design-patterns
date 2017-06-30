package ru.demi.patterns.base.behavioral.visitor;

public class XmlFormatter implements Formatter {
	@Override
	public void format(StatisticalReport statisticalReport) {
		System.out.println("Xml formatting for statistical report.");
	}

	@Override
	public void format(OperationalReport operationalReport) {
		System.out.println("Xml formatting for operational report.");
	}

	@Override
	public void format(AccountingReport accountingReport) {
		System.out.println("Xml formatting for accounting report.");
	}

	@Override
	public void format(TaxReport taxReport) {
		System.out.println("Xml formatting for tax report.");
	}
}

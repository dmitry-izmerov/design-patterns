package ru.demi.patterns.base.behavioral.visitor;

public class ExcelFormatter implements Formatter {
	@Override
	public void format(StatisticalReport statisticalReport) {
		System.out.println("Excel formatting for statistical report.");
	}

	@Override
	public void format(OperationalReport operationalReport) {
		System.out.println("Excel formatting for operational report.");
	}

	@Override
	public void format(AccountingReport accountingReport) {
		System.out.println("Excel formatting for accounting report.");
	}

	@Override
	public void format(TaxReport taxReport) {
		System.out.println("Excel formatting for tax report.");
	}
}

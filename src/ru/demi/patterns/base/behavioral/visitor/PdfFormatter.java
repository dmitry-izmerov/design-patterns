package ru.demi.patterns.base.behavioral.visitor;

public class PdfFormatter implements Formatter {
	@Override
	public void format(StatisticalReport statisticalReport) {
		System.out.println("Pdf formatting for statistical report.");
	}

	@Override
	public void format(OperationalReport operationalReport) {
		System.out.println("Pdf formatting for operational report.");
	}

	@Override
	public void format(AccountingReport accountingReport) {
		System.out.println("Pdf formatting for accounting report.");
	}

	@Override
	public void format(TaxReport taxReport) {
		System.out.println("Pdf formatting for tax report.");
	}
}

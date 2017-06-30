package ru.demi.patterns.base.behavioral.visitor;

public class App {
	public static void main(String[] args) {
		Company company = new Company();
		company.addReport(new OperationalReport());
		company.addReport(new StatisticalReport());
		company.addReport(new AccountingReport());
		company.addReport(new TaxReport());

		company.formatReports(new PdfFormatter());
		company.formatReports(new XmlFormatter());
	}
}

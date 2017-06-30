package ru.demi.patterns.base.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Company {
	List<Report> reports = new ArrayList<>();

	public void addReport(Report report) {
		reports.add(report);
	}

	public void removeReport(Report report) {
		reports.remove(report);
	}

	public void formatReports(Formatter formatter) {
		reports.forEach(report -> report.formattedBy(formatter));
	}
}

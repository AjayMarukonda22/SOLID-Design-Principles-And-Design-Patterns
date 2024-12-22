package DesignPrinciples.SRP;

import DesignPrinciples.SRP.Report;

public class ReportPrinter {
    private Report report;

    public ReportPrinter(Report report) {
        this.report = report;
    }

    public void print(){
        System.out.println("Report Title: " + report.getTitle());
        System.out.println("Description: " + report.getDescription());
        System.out.println("Author: " + report.getAuthor());
        System.out.println("Created At: " + report.getCreatedAt());
        System.out.println("Data: " + String.join(", ", report.getData()));
    }
}

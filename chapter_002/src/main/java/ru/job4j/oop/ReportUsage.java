package ru.job4j.oop;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport textReport = new TextReport();
        JSONReport jsonReport = new JSONReport();
        String text = jsonReport.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}

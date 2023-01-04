package com.oneapp.basic;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Reports_Generator {
	
	public static ExtentHtmlReporter report;
	public static ExtentReports extent;
	
	public static ExtentReports getreports() {
		
		String path= "D:\\JAVA\\Eclipse- workspace\\oneapp\\Reports\\index.html";
		report = new ExtentHtmlReporter(path);
		
		report.config().setDocumentTitle("Hero_App-Automation Test Report");
		report.config().setReportName("Hero_App");
		report.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Laptop-Lenovo", "Hero_App");
		extent.setSystemInfo("QA", "Gunjan Rawat");
		extent.setSystemInfo("Operating system", "Windows 10");
		return extent;
	}


}

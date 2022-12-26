package com.oneapp.reports;

import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
       static ExtentReports extent;
       final static String filePath ="Extent.html";
       static Map<Integer, ExtentTest> extentTestMap = new HashMap();
       
       public static ExtentReports getReporter()
       {
	 if (extent ==null)
	 {
		 ExtentHtmlReporter html = new ExtentHtmlReporter("Extent.html");
		 html.config().setDocumentTitle("Appium Framework");
		 html.config().setReportName("Hero one application");
		 extent = new ExtentReports();
		 extent.attachReporter(html);
	 }
	 
	 return extent;   
       }
       
       public static ExtentTest getTest()
       {
		return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
    	   
       }
  
       public static ExtentTest startTest(String testName, String desc)
       {
    	   ExtentTest test = getReporter().createTest(testName, desc);
    	   extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
    	   
    	   return test;
       }
       





}

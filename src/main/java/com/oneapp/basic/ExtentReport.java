package com.oneapp.basic;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;

import io.appium.java_client.android.AndroidDriver;

public class ExtentReport {

	public static ExtentReports report;
    static Map<Integer, ExtentTest> extentTestMap = new HashMap();


	public static ExtentReports getReporter() {
		if (report == null) {
			ExtentHtmlReporter extent = new ExtentHtmlReporter("./Reports/HeroApp.html");
			report = new ExtentReports();
			report.attachReporter(extent);
		}
		return report;
	}

	
	public static ExtentTest getTest()
	{
		return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
    	   
	}
	

    public static ExtentTest startTest(String testName, String desc)
    {
 	   ExtentTest logger = getReporter().createTest(testName, desc);
 	   extentTestMap.put((int) (long) (Thread.currentThread().getId()), logger);
 	   return logger;
    }
	
    
    
    public static String CaptureScreenshot() throws IOException
    {
   	TakesScreenshot ts = (TakesScreenshot)BrowserFactory.ad;
   	 File f = ts.getScreenshotAs(OutputType.FILE);
   	 String filepath ="./screenshot/HeroApp " + "png";
  	  FileUtils.copyFile(f, new File(filepath));
  	  return filepath;
  	  
    }
  	  
  	  
  	  
  //  	File screenshotFile = ((TakesScreenshot)BrowserFactory.ad).getScreenshotAs(OutputType.FILE);
//		String DestFile = "./screenshots/screenshot.png";
//
//		try {
//			Files.copy(screenshotFile, new File(DestFile));
//		}
//
//		catch (IOException e) {
//			System.out.println("Unable to take screenshot " + e.getMessage());
//		}
//		
//		return DestFile;

    
    
    
    
	

}

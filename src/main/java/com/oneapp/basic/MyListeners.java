package com.oneapp.basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.google.common.io.Files;
import com.oneapp.page_actions.Login_Page_Action;

import io.appium.java_client.android.AndroidDriver;

public class MyListeners implements ITestListener {
	
	public static ExtentTest test;

	
	ExtentReports extent= Extent_Reports_Generator.getreports();
	ThreadLocal<ExtentTest> extent_test=new ThreadLocal<ExtentTest>();
	

		public void onTestStart(ITestResult result) {
			test=extent.createTest(result.getTestClass().getName()+ "== " +result.getMethod().getMethodName());
			extent_test.set(test);
		}
	
		public void onTestSuccess(ITestResult result) {
			test.log(Status.PASS, "Test Case Pass");
			test.addScreenCaptureFromBase64String(BrowserFactory.getcapcture());
		}
	
		public void onTestFailure(ITestResult result) {
			test.log(Status.FAIL, "Test Case Fail");
		}
	
		public void onTestSkipped(ITestResult result) {
			test.log(Status.SKIP, "Test Case Skip");
		}
	
	
		public void onFinish(ITestContext context) {
			extent.flush();
		}
		
	
}
	
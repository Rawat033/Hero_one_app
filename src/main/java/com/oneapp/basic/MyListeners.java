package com.oneapp.basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.google.common.io.Files;
import com.oneapp.page_actions.Login_Page_Action;

import io.appium.java_client.android.AndroidDriver;

public class MyListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		ExtentReport.startTest(result.getName(), result.getMethod().getDescription()).assignAuthor("Gunjan Rawat");
	}

	public void onTestSuccess(ITestResult result) {
		ExtentReport.getTest().log(Status.PASS, "Test Passed");
	}

	public void onTestFailure(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			
//			try {
//				String screenshotPath = ExtentReport.CaptureScreenshot(result.getMethod().getMethodName()+".png");
//				ExtentReport.getTest().addScreenCaptureFromPath(screenshotPath)
//				.fail((Markup) MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
//			} 
//			catch (IOException e) 
			
//			{
//				System.out.println("Unable to take log test " + e.getMessage());
//			}
			
				try {
					ExtentReport.getTest().fail("Test failed", MediaEntityBuilder.createScreenCaptureFromPath(ExtentReport.CaptureScreenshot()).build());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		ExtentReport.getReporter().flush();
	}
			
			
			
			
//			try {
//				ExtentReport.getTest().fail(result.getThrowable().getMessage(),
//						MediaEntityBuilder.createScreenCaptureFromPath(DestFile).build());
//			} 
//			catch (IOException e) {
//				System.out.println("Unable to take log test " + e.getMessage());
//			}
			
			
//			try {
//				ExtentReport.getTest().fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(ExtentReport.CaptureScreenshot()).build());
//			} 
//			catch (IOException e) 
//			{
//				System.out.println("Unable to log screenshot "+e.getMessage());
//			}
				
	

	


	public void onTestSkipped(ITestResult result) {
		ExtentReport.getTest().log(Status.SKIP, "Test Skipped");
	}

	public void onStart(ITestContext context) {

		System.out.println("It executes when any test case gets start" + context.getName());

	}

	public void onFinish(ITestContext context) {
		ExtentReport.getReporter().flush();

	}

}

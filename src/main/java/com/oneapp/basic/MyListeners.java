package com.oneapp.basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.google.common.io.Files;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.reports.ExtentReport;

import io.appium.java_client.android.AndroidDriver;

public class MyListeners implements ITestListener {

	public void onTestStart(ITestResult result) {

		ExtentReport.startTest(result.getName(), result.getMethod().getDescription()).assignAuthor("Gunjan Rawat");

	}

	public void onTestSuccess(ITestResult result) {
		ExtentReport.getTest().log(Status.PASS, "Test Passed");

	}

	public void onTestFailure(ITestResult result) {

		ExtentReport.getTest().log(Status.FAIL, "Test Failed");

	}

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

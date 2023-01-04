package com.oneapp.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

import org.bson.internal.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;

import io.appium.java_client.android.AndroidDriver;

public class BrowserFactory {

	public static AndroidDriver ad;// Global AndroidDriver

//	@Parameters({ "PLATFORM_NAME", "DEVICE_NAME", "AUTOMATION_NAME", "UDID" })
	
	 @BeforeMethod(alwaysRun = true)
	public void Browsers_open() throws MalformedURLException {

		// This is origional
		ad = Create_Driver_Session.Androidsession("Android");
		ad.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		Reporter.log("Android emulator gets opened", true);

		// For Pcloudy

//            	ad = Pcloudy_Create_Driver_Session.Androidsession(Platform);
//            	ad.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);  
//            	Reporter.log("Android emulator gets opened", true);

	}

	 @AfterMethod(alwaysRun = true)
	public void Browsers_teardown() {
		// ad.quit();
		// Reporter.log("Android emulator gets closed", true);
	}

	 public static String getcapcture() {
			TakesScreenshot ts=(TakesScreenshot) ad;
			return ts.getScreenshotAs(OutputType.BASE64);
		}

}

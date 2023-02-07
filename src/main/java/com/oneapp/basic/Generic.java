package com.oneapp.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Generic extends BrowserFactory {

	public static WebDriver driver;
	public static TouchAction ta;

	public static void WifiOff() {
		ConnectionState state = ad.setConnection(new ConnectionStateBuilder().withWiFiDisabled().build());
		Assert.assertFalse(state.isWiFiEnabled(), "Wifi is not switched off");
		Reporter.log("WiFi turned off");
	}

	public static void WifiOn() {
		ConnectionState state = ad.setConnection(new ConnectionStateBuilder().withWiFiEnabled().build());
		Assert.assertTrue(state.isWiFiEnabled(), "Wifi is not switched on");
		Reporter.log("WiFi turned on");
	}

	public static void Run_app_in_background() throws InterruptedException {
		((AndroidDriver) ad).runAppInBackground(Duration.ofSeconds(10));
		// Thread.sleep(5000);
	}

	public static void page_Scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}

	public static void sendkeys_element(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void swiping(int startx, int starty, int endx, int endy, long wait) throws InterruptedException {
		  ta = new TouchAction(ad);
			Thread.sleep(5000);
		ta.press(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(wait))).release().perform();
		System.out.println("Swiped succesfully");
		Thread.sleep(5000);
	}
	
	public static void click_on_WebElement(WebElement element, long waitTimeInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, waitTimeInSeconds);
		WebElement elements=null;
		elements=wait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
	}
	
	public static void Tap_on_WebElement(int startx, int starty)
	{
		 ta.tap(TapOptions.tapOptions().withPosition(PointOption.point(startx, starty ))).perform();
	}
	
	
	

}

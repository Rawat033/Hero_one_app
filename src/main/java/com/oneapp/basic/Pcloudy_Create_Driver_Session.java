package com.oneapp.basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Pcloudy_Create_Driver_Session {

	public static DesiredCapabilities capabilities;

	public static AndroidDriver creating_session(String Platform_name) throws MalformedURLException {
		AndroidDriver ad = null;

		if (Platform_name.equalsIgnoreCase("android")) {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("pCloudy_Username", "mobileapp7.support@heromotocorp.com");
			capabilities.setCapability("pCloudy_ApiKey", "4mmqmhz7zcctk866c7r6294h");
			capabilities.setCapability("pCloudy_DurationInMinutes", 10);
			capabilities.setCapability("newCommandTimeout", 600);
			capabilities.setCapability("launchTimeout", 90000);
			capabilities.setCapability("pCloudy_DeviceFullName", "SAMSUNG_GalaxyNote20_Android_12.0.0_dd2e9");
			capabilities.setCapability("platformVersion", "12.0.0");
			capabilities.setCapability("platformName", Platform_name);
			capabilities.setCapability("automationName", "uiautomator2");
			capabilities.setCapability("pCloudy_ApplicationName", "app-debug.apk");
			capabilities.setCapability("appPackage", "com.customerapp.hero");
			capabilities.setCapability("appActivity", "com.customerapp.hero.views.activity.splash.SplashActivity");
			capabilities.setCapability("pCloudy_WildNet", "false");
			capabilities.setCapability("pCloudy_EnableVideo", "false");
			capabilities.setCapability("pCloudy_EnablePerformanceData", "false");
			capabilities.setCapability("pCloudy_EnableDeviceLogs", "false");
			capabilities.setCapability("project", "Hero app");
			capabilities.setCapability("build", "Android latest APK - 9.0.5");
			capabilities.setCapability("name", "Invalid login");
			capabilities.setCapability("tag", "newtag");

			URL url = new URL("https://device.pcloudy.com/appiumcloud/wd/hub");
//			URL url = new URL	("https://device.pcloudy.com/progressive/wd/hub");

			System.out.println("My app has launched in emulator in Android");

			ad = new AndroidDriver(url, capabilities);
		}

		else if (Platform_name.equalsIgnoreCase("ios")) {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("pCloudy_Username", "mobileapp7.support@heromotocorp.com");
			capabilities.setCapability("pCloudy_ApiKey", "4mmqmhz7zcctk866c7r6294h");
			capabilities.setCapability("pCloudy_DurationInMinutes", 10);
			capabilities.setCapability("newCommandTimeout", 600);
			capabilities.setCapability("launchTimeout", 90000);
			capabilities.setCapability("pCloudy_DeviceFullName", "APPLE_iPhone14_iOS_16.0.1_fe1c6");
			capabilities.setCapability("platformVersion", "16.0.1");
			capabilities.setCapability("platformName", "ios");
			capabilities.setCapability("acceptAlerts", true);
			capabilities.setCapability("automationName", "XCUITest");
			capabilities.setCapability("pCloudy_ApplicationName", "OneApp_Resigned1676455718.ipa");
			capabilities.setCapability("bundleId", "com.customerapp.hero");
			capabilities.setCapability("pCloudy_WildNet", "false");
			capabilities.setCapability("pCloudy_EnableVideo", "false");
			capabilities.setCapability("pCloudy_EnablePerformanceData", "false");
			capabilities.setCapability("pCloudy_EnableDeviceLogs", "false");
//			IOSDriver<WebElement> driver = new IOSDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);

			URL url = new URL("https://device.pcloudy.com/appiumcloud/wd/hub");
//			URL url = new URL	("https://device.pcloudy.com/progressive/wd/hub");

			System.out.println("My app has launched in emulator in Android");

//			ad = new IOSDriver(url, capabilities);

		}

		return ad;

	}
}

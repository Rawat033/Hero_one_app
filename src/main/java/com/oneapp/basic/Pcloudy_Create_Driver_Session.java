package com.oneapp.basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Pcloudy_Create_Driver_Session {
	
	public static DesiredCapabilities capabilities;

	public static AndroidDriver Androidsession(String Platform_name) throws MalformedURLException {
		AndroidDriver ad= null;
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("pCloudy_Username", "mobileapp7.support@heromotocorp.com");
	capabilities.setCapability("pCloudy_ApiKey", "4mmqmhz7zcctk866c7r6294h");
	capabilities.setCapability("pCloudy_DurationInMinutes", 10);
	capabilities.setCapability("newCommandTimeout", 600);
	capabilities.setCapability("launchTimeout", 90000);
	capabilities.setCapability("pCloudy_DeviceFullName", "GOOGLE_Pixel3_Android_12.0.0_a6091");
	capabilities.setCapability("platformVersion", "12.0.0");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("automationName", "uiautomator2");
	capabilities.setCapability("pCloudy_ApplicationName", "app-debug_multiple_view.apk");
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
//	URL url = new URL	("https://device.pcloudy.com/progressive/wd/hub");

System.out.println("My app has launched in emulator");

	ad = new AndroidDriver(url, capabilities);

return ad;
	
	
	
	
	
	
	
	
	}
}

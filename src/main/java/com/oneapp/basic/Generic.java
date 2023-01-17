package com.oneapp.basic;

import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;

public class Generic extends BrowserFactory{
		
	
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
	
	public static void Run_app_in_background() throws InterruptedException
	{
		((AndroidDriver)ad).runAppInBackground(Duration.ofSeconds(10));
		Thread.sleep(5000);
	}

}

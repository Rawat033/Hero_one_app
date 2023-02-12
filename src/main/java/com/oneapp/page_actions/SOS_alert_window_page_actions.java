package com.oneapp.page_actions;

import org.testng.Assert;

import com.oneapp.pageobjects.SOS_alert_window_page_object;
import com.oneapp.pageobjects.SOS_page_object;

import io.appium.java_client.android.AndroidDriver;

public class SOS_alert_window_page_actions {
	
	public AndroidDriver ad;
	public SOS_alert_window_page_object SOSawpo;

	public SOS_alert_window_page_actions(AndroidDriver ad) {
		this.ad = ad;
		SOSawpo = new SOS_alert_window_page_object(ad);
	}

	
	public void taping_on_send_alert_now_button()
	{
		SOSawpo.getSend_alert_now_button().click();
	}
	
	public void assert_SOS_message()
	{
		String actual_toast_message= SOSawpo.getToast_message().getAttribute("name");
		String expected_toast_message = "We have sent alert SMS successfully";
		System.out.println(actual_toast_message);
		Assert.assertEquals(expected_toast_message, actual_toast_message);
	}
	
}

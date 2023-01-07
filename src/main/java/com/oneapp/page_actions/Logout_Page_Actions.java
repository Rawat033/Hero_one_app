package com.oneapp.page_actions;

import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Logout_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Logout_Page_Actions {
	public AndroidDriver ad;
	public TouchAction ta;
	public Logout_Page_Object lgpo;

	public Logout_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		lgpo = new Logout_Page_Object(ad);
	}
	
	public void click_yes_under_logout()
	{
		lgpo.getYes_text().click();
	}

}

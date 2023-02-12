package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SOS_alert_window_page_object {
	
	@FindBy(id="com.customerapp.hero:id/button_red")
	private WebElement Send_alert_now_button;
	
	@FindBy(xpath="//android.widget.Toast[1]")
	private WebElement toast_message;
	
	public SOS_alert_window_page_object(AndroidDriver ad)
	{
		
		PageFactory.initElements(ad, this);
		
	}


	public WebElement getSend_alert_now_button() {
		return Send_alert_now_button;
	}


	public WebElement getToast_message() {
		return toast_message;
	}


	
	
	

}

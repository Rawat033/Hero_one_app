package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SOS_page_object {
	
	@FindBy(id="com.customerapp.hero:id/ic_sos")
	private WebElement SOS_icon;
	
	
	public SOS_page_object(AndroidDriver ad)
	{
		
		PageFactory.initElements(ad, this);
		
	}


	public WebElement getSOS_icon() {
		return SOS_icon;
	}

	
	

	

}

package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Privacy_Policy_Page_Object {
	
	@FindBys
	({
	@FindBy(className= "android.view.View")
	})
	private List<WebElement> privacytext_val;
	
	public Privacy_Policy_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}

	public List<WebElement> getPrivacytext_val() {
		return privacytext_val;
	}
	
	
	
}

package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Tips_page_object {
	
	@FindBy(id = "com.customerapp.hero:id/rv_item_lbl")
	private WebElement myprofile_menu_bar_txt;
	
	public Tips_page_object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}
	
	

}

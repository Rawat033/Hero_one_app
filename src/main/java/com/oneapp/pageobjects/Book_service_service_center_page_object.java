package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Book_service_service_center_page_object {
	
	@FindBy(id="com.customerapp.hero:id/centerName")
	private WebElement select_service_center_textbox;
	
	@FindBy(id="com.customerapp.hero:id/radio1")
	private WebElement free_service_radio_button;
	
	@FindBy(id="com.customerapp.hero:id/btn_lbl")
	private WebElement continue_btn;
	
	@FindBy(id="com.customerapp.hero:id/radio2")
	private WebElement paid_service_radio_button;
	
	
	public Book_service_service_center_page_object(AndroidDriver ad)
	{
		
		PageFactory.initElements(ad, this);
		
	}


	public WebElement getSelect_service_center_textbox() {
		return select_service_center_textbox;
	}


	public WebElement getService_Type_radio_button() {
		return free_service_radio_button;
	}


	public WebElement getContinue_btn() {
		return continue_btn;
	}


	public WebElement getPaid_service_radio_button() {
		return paid_service_radio_button;
	}

	
	
	
	
	

}

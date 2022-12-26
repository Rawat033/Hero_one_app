package com.oneapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Dashboard_Page_object {
	
	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	private WebElement Location_popup;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	private WebElement nearby_devices_popup;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	private WebElement calllogs_popup;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	private WebElement contacts_popup;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	private WebElement managephonecalls_popup;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	private WebElement sms_messages_popup;

	@FindBy(className="android.widget.LinearLayout")
	private List<WebElement> Location_pop_displaying;
	
	@FindBy(id="com.customerapp.hero:id/side_menu_btn")
	private WebElement menu_bar_icon;
	
	@FindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Services\"]/android.widget.FrameLayout/android.widget.ImageView")
	private WebElement services_icon;
	
	
	
	
	public Dashboard_Page_object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}



	public WebElement getLocation_popup() {
		return Location_popup;
	}



	public WebElement getNearby_devices_popup() {
		return nearby_devices_popup;
	}



	public WebElement getCalllogs_popup() {
		return calllogs_popup;
	}

	public WebElement getManagephonecalls_popup() {
		return managephonecalls_popup;
	}



	public WebElement getContacts_popup() {
		return contacts_popup;
	}


	public WebElement getSms_messages_popup() {
		return sms_messages_popup;
	}



	public WebElement getMenu_bar_icon() {
		return menu_bar_icon;
	}



	public List<WebElement> getLocation_pop_displaying() {
		return Location_pop_displaying;
	}



	public WebElement getServices_icon() {
		return services_icon;
	}


	
	
	
	


}

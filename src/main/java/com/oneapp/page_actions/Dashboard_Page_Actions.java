package com.oneapp.page_actions;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Dashboard_Page_Actions {

	public AndroidDriver ad;
	public TouchAction ta;
	public Dashboard_Page_object dpo;

	public Dashboard_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		dpo = new Dashboard_Page_object(ad);
	}

	public void Handling_Dashboard_All_Popups() throws InterruptedException {
		Thread.sleep(5000);
		
		dpo.getLocation_popup().click();
		Thread.sleep(15000);
		
//		String str= "Allow Hero App to access this device’s location?";
//		String popup_dis = dpo.getLocation_pop_displaying().getText();
		
//		WebElement popup_dis = dpo.getLocation_pop_displaying().get(4);
//		if (popup_dis.equalsIgnoreCase(str))
//		if (popup_dis.isDisplayed())
			
//		{
//			dpo.getLocation_popup().click();
//			Thread.sleep(3000);
//			Reporter.log("Location popup is displaying", true);
//		}
//		
//		else
//		{
//			Reporter.log("Location popup is not displaying because it has already enabled", true);
//		}
		
//		dpo.getNearby_devices_popup().click();
//		Thread.sleep(3000);
//		dpo.getCalllogs_popup().click();
//		Thread.sleep(3000);
//		dpo.getContacts_popup().click();
//		Thread.sleep(3000);
//		dpo.getManagephonecalls_popup().click();
//		Thread.sleep(3000);
//		dpo.getSms_messages_popup().click();
//		Thread.sleep(3000);
		
	}
	
	public void MenubarList()
	{
		dpo.getMenu_bar_icon().click();
	}
	
	public void Services_icon()
	{
		dpo.getServices_icon().click();
	}
	
	public void Goodlife_icon()
	{
		dpo.getGoodlife_icon().click();
	}
	
	
	
	
	
	
	

}

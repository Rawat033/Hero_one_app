package com.oneapp.page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.oneapp.pageobjects.Book_service_service_center_page_object;
import com.oneapp.pageobjects.Select_Service_Center_Page_Object;

import io.appium.java_client.android.AndroidDriver;

public class Select_Service_Center_Page_Actions {
	public AndroidDriver ad;
	public Select_Service_Center_Page_Object sscpo;

	public Select_Service_Center_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		sscpo = new Select_Service_Center_Page_Object(ad);
	}

	
	public void Selecting_Service_center_process() throws InterruptedException
	{
		sscpo.getList_view_icon().click();
		sscpo.getState_box().click();
		List<WebElement> options = sscpo.getState_typedropdown();
		System.out.println(options.size());
		
		for (WebElement element : options) {
			String val = element.getText();
			if (val.equalsIgnoreCase("delhi")) {
				element.click();
				break;
			}
		}
		
		sscpo.getCity_box().click();
		List<WebElement> options1 = sscpo.getCity_typedropdown();
		System.out.println(options1.size());
		
		for (WebElement element1 : options1) {
			String val1 = element1.getText();
			if (val1.equalsIgnoreCase("delhi")) {
				element1.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		sscpo.getService_center_radio_button().click();
		
		
		
		
	}

}

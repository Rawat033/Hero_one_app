package com.oneapp.page_actions;

import com.oneapp.pageobjects.Book_service_service_center_page_object;
import com.oneapp.pageobjects.Vehicle_Service_page_object;

import io.appium.java_client.android.AndroidDriver;

public class Book_service_service_center_page_actions {
	
	public AndroidDriver ad;
	public Book_service_service_center_page_object bsscpo;

	public Book_service_service_center_page_actions(AndroidDriver ad) {
		this.ad = ad;
		bsscpo = new Book_service_service_center_page_object(ad);
	}
	

	public void Select_Service_Center() throws InterruptedException
	{
		bsscpo.getSelect_service_center_textbox().click();
		Thread.sleep(5000);
	}
	
	public void ServiceType_and_continue_btn() throws InterruptedException
	{
		if (bsscpo.getService_Type_radio_button().isSelected())
		{
			System.out.println("FSC is already selected. Thanks! ");
		}
		
		else
		{
			bsscpo.getService_Type_radio_button().click();
			System.out.println(" FSC was not selected but now selected. Thanks! ");
		}

		bsscpo.getContinue_btn().click();
		Thread.sleep(6000);
	}
	
	
}

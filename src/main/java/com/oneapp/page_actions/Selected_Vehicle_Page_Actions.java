package com.oneapp.page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.basic.ExcelData;
import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Selected_Vehicle_Page_Actions {
	public ExcelData exceldata;

//	public String str = "MBLHA10EWBGE54873";
//	public String str1="MBLHA10EWBGE54873";
	public AndroidDriver ad;

	public Selected_Vehicle_Page_Object svpo;
	public TouchAction ta;

	public Selected_Vehicle_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		svpo = new Selected_Vehicle_Page_Object(ad);
		 exceldata= new ExcelData();
	}

	public void Assertion_selected_vehicle_page()
	{
		String expected = svpo.getBook_service_vin().getText();
		String actual = "Book service FSC";
		Assert.assertEquals(actual, expected);
	}
	public void Vehicle_Select() throws InterruptedException {
		
	//	String bs="Goodlife nonmem";
		String vin=exceldata.getStringData("Selected Vehicle Page", 1, 0);
//		svpo.getGoodlife_vin().click();
//		System.out.println("Bookservice Vin selected");
		
		
//		This is origional
		if (svpo.getBook_service_vin().getText().equalsIgnoreCase(vin))
		{
			svpo.getBook_service_vin().click();
			System.out.println("Book service FSC Vin selected");
		}
		
		else
		{
			svpo.getGoodlife_vin().click();
			System.out.println("Goodlife Vin selected");
		}
		
		svpo.getContinuebtn_selected_vehicle().click();
		Thread.sleep(15000);
	}

	}

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

	public void Vehicle_Select() throws InterruptedException {
		
	//	String bs="Goodlife nonmem";
		String vin=exceldata.getStringData("Selected Vehicle Page", 0, 0);
		
		if (svpo.getBook_service_vin().getText().equalsIgnoreCase(vin))
		{
			svpo.getBook_service_vin().click();
			System.out.println("Book service Vin selected");
		}
		
		else
		{
			svpo.getGoodlife_vin().click();
			System.out.println("Goodlife Vin selected");
		}
		
//		String str1 = "Primary Vehicle";
//		
//		if (svpo.getMakeprimary().getText().equalsIgnoreCase(str1))
//		{
//			System.out.println("Yes my primary Vehicle is " + svpo.getVin_number().getText());
//			Assert.assertEquals(svpo.getVin_number().getText(), exceldata.getStringData("Selected Vehicle Page", 0, 0));
//		}
//		
//		else
//		{
//			svpo.getVin_number().click();
//			System.out.println("Earlier My primary vehicle is different but now " + svpo.getVin_number().getText());
//			Assert.assertEquals(svpo.getVin_number().getText(), exceldata.getStringData("Selected Vehicle Page", 0, 0));
//		}
//		
		svpo.getContinuebtn_selected_vehicle().click();
		Thread.sleep(10000);
	}

	}

package com.oneapp.page_actions;

import org.testng.Assert;

import com.oneapp.pageobjects.OTP_Page_Object;
import com.oneapp.pageobjects.Selected_Vehicle_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Selected_Vehicle_Page_Actions {

	public String str = "MBLHA10EWBGE54873";
//	public String str1="MBLHA10EWBGE54873";
	public AndroidDriver ad;

	public Selected_Vehicle_Page_Object svpo;
	public TouchAction ta;

	public Selected_Vehicle_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		svpo = new Selected_Vehicle_Page_Object(ad);
	}

	public void Vehicle_Select() throws InterruptedException {
		String str1 = "Primary Vehicle";

		if (svpo.getMakeprimary().getText().contains(str1)) {

			System.out.println("Yes my primary Vehicle is " + svpo.getVin_number().getText());
			Assert.assertEquals(svpo.getVin_number().getText(), str);
		}

//		if (str1.equalsIgnoreCase(svpo.getMakeprimary().getText()))
//		{
//			
//			svpo.getMakeprimary().click();
//			System.out.println("Yes my primary Vehicle - MBLHA10EWBGE54873");
//		}

		else {
			svpo.getVin_number().click();
			// svpo.getVehicleselection().click();
			System.out.println("Earlier My primary vehicle is different but now " + svpo.getVin_number().getText());
			Assert.assertEquals(svpo.getVin_number().getText(), str);

		}

		svpo.getContinuebtn_selected_vehicle().click();
		Thread.sleep(10000);
	}

}

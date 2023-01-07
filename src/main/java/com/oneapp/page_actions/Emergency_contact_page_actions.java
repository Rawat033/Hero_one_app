package com.oneapp.page_actions;

import org.testng.Assert;
import org.testng.Reporter;

import com.oneapp.pageobjects.Emerygency_contacts_page_objects;
import com.oneapp.pageobjects.MyProfile_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Emergency_contact_page_actions {
	
	public AndroidDriver ad;
	public Emerygency_contacts_page_objects ecpo;
	public TouchAction ta;

	public Emergency_contact_page_actions(AndroidDriver ad) {
		this.ad = ad;
		ecpo = new Emerygency_contacts_page_objects(ad);
	}
	
	public void Adding_emergency_contact()
	{
		ecpo.getAdd_emergency_contact_link().click();
		
		if(ecpo.getContact_allowing_popup().isDisplayed())
		{
			ecpo.getAllow_btn().click();
		}
		else 
		{
			System.out.println("Contact_allow_pop_up not displaying");
		}
		
		ecpo.getCreate_text().click();
		
	}
	
	public void saved_contact_val()
	{
		String expected_mob_num="8130998133";
		if (ecpo.getSaved_mob_number_contact().getText().equalsIgnoreCase(expected_mob_num))
		{
		Assert.assertEquals(ecpo.getSaved_mob_number_contact().getText(), expected_mob_num);
		Reporter.log(ecpo.getSaved_mob_number_contact().getText(), true);
		}
		
	}

	public void Deleting_contact() throws InterruptedException
	{
		ecpo.getThreedots_besides_contact_num().click();
		 ta = new TouchAction(ad);
		 Thread.sleep(3000);
		 ta.tap(TapOptions.tapOptions().withPosition(PointOption.point(769, 614))).perform();
		 ecpo.getDelete_btn().click();
		 String expected_emergency_contact_link="Add Emergency contact";
		 Assert.assertEquals(ecpo.getAdd_emergency_contact_link().getText(), expected_emergency_contact_link);
		 Reporter.log("Contact deleted succesfully and now displaying "+ecpo.getAdd_emergency_contact_link().getText(), true);
	}
	
	public void click_back_icon()
	{
		ecpo.getBack_icon().click();
		
	}
	
	
	
	
}

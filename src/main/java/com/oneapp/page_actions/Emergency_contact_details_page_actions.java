package com.oneapp.page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.Emergency_contact_details_page_object;
import com.oneapp.pageobjects.Emerygency_contacts_page_objects;

import io.appium.java_client.android.AndroidDriver;

public class Emergency_contact_details_page_actions {
	public AndroidDriver ad;
	public Emergency_contact_details_page_object ecdpo;

	public Emergency_contact_details_page_actions(AndroidDriver ad) {
		this.ad = ad;
		ecdpo = new Emergency_contact_details_page_object(ad);
	}

	public void filling_emergency_contact_details() {
		Generic.sendkeys_element(ecdpo.getFullname_textbox(), "Me");
		Generic.sendkeys_element(ecdpo.getMob_number_txtbox(), "8130998133");
		ecdpo.getRelation_type().click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}		
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		
		for (WebElement element : options) {
			String val = element.getText();
			if (val.equalsIgnoreCase("friend")) {
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
				}
				element.click();
				break;
			}
		}

		
//		for loop
//		
//		 int options = ecdpo.getRelation_typedropdown().size();
//		 for (int i=0;i<options;i++)
//		 {
//			 String text = ecdpo.getRelation_typedropdown().get(i).getText();
//			 if (text.equalsIgnoreCase("friend"))
//			 {
//				 ecdpo.getRelation_typedropdown().get(i).click();
//				 break;
//			 }
//			 
//		 }
	

		
		ecdpo.getContinue_btn().click();

	}

}

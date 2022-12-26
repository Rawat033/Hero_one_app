package com.oneapp.page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;

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

	public void filling_emergency_contact_details() throws InterruptedException {
		ecdpo.getFullname_textbox().sendKeys("Me");
		ecdpo.getMob_number_txtbox().sendKeys("8130998133");
		ecdpo.getRelation_type().click();
		List<WebElement> options = ecdpo.getRelation_typedropdown();
		System.out.println(options.size());

		for (WebElement element : options) {
			String val = element.getText();
			if (val.equalsIgnoreCase("friend")) {
				element.click();
				break;
			}
		}

		Thread.sleep(3000);
		
		ecdpo.getContinue_btn().click();

	}

}

package com.oneapp.page_actions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.oneapp.pageobjects.Menu_Bar_Page_Object;
import com.oneapp.pageobjects.MyProfile_Page_Object;

import io.appium.java_client.android.AndroidDriver;

public class Myprofile_Page_Actions {

	public AndroidDriver ad;
	public MyProfile_Page_Object mppo;

	public Myprofile_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		mppo = new MyProfile_Page_Object(ad);
	}

	public void Profiledetails_val() throws InterruptedException {
		String Expectedtext = "Profile Details";
		Reporter.log(mppo.getProfiledetails_text().getText(), true);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(mppo.getProfiledetails_text().getText(), Expectedtext);
		System.out.println(sa);
		Thread.sleep(5000);
		mppo.getMoredetails_link().click();
		mppo.getEditprofile_details_btn().click();
	}

	public void click_back_icon()
	{
		mppo.getBack_icon().click();
		
	}
	public void profile_details_after_saving_validation()

	{
		mppo.getMoredetails_link().click();
		
		String expected_address = "f30 mumbai bandra east";
		
		if (mppo.getAddress_val().getText().equalsIgnoreCase(expected_address)) {
			Assert.assertEquals(mppo.getAddress_val().getText(), expected_address);
			Reporter.log("AFTER SAVING MY PROFILE DETAILS", true);
			Reporter.log(mppo.getAddress_val().getText(), true);
			String expected_gender = "Female";
			Assert.assertEquals(mppo.getGender_val().getText(), expected_gender);
			Reporter.log(mppo.getGender_val().getText(), true);
		}

		else {
			Reporter.log("Adsress field is blank", true);
		}

	}
	
	public void Emergency_contact() throws InterruptedException
	{
		Thread.sleep(3000);
		mppo.getEmergency_contact_txt().click();
		
	
	}
	
	public void click_manage_licence()
	{
		mppo.getManage_license_text().click();
	}

	
	
	
}

package com.oneapp.page_actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.oneapp.pageobjects.MyProfile_Page_Object;
import com.oneapp.pageobjects.Personal_Details_Page_Object;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Personal_Details_Page_Actions {

	public AndroidDriver ad;
	public Personal_Details_Page_Object pdpo;
	public TouchAction ta;

	public Personal_Details_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		pdpo = new Personal_Details_Page_Object(ad);
	}

//	public void Swipe_Personaldetails_Page()
//	{
//		 TouchAction ta= new TouchAction(ad);
//		 ta.press(PointOption.point(542,1660)).moveTo(PointOption.point(565,269)).release().perform();
//		 System.out.println("Swiped succesfully");
//	}

	public void Personal_details_page() throws InterruptedException {
//		String Expected="index";
//		SoftAssert sa=new SoftAssert();
//		Thread.sleep(3000);
//		WebElement personal_details_text = pdpo.getPersonal_details_text().get(2);
//		sa.assertEquals(personal_details_text.getAttribute("4"), Expected);
//		System.out.println(sa);
		Thread.sleep(4000);
		WebElement fullname_field = pdpo.getFullname_textfield();
		fullname_field.clear();
		fullname_field.sendKeys("Gunjan Rawat");
		WebElement gender_selection = pdpo.getGender_checkbox();

		if (gender_selection.isSelected()) {
			System.out.println("Female is already selected");
		}

		else {
			gender_selection.click();
			System.out.println("Female was not selected earlier but now it has been selected");
		}

		ta = new TouchAction(ad);
		Thread.sleep(3000);
		ta.press(PointOption.point(534, 1349)).moveTo(PointOption.point(538, 792))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).release().perform();
		System.out.println("Swiped succesfully");
		Thread.sleep(5000);

		WebElement email = pdpo.getEmailfield();
		email.clear();
		email.sendKeys("gunjan12345677@gmail.com");

		System.out.println("*************************************");
		Thread.sleep(4000);

//		if (pdpo.getDatefield().getText().contains("20")) 
//		{
//			System.out.println("Date has already selected");
//		}
//
//		else {
//			Thread.sleep(2000);		
//			WebElement date_field = pdpo.getDatefield();
//			date_field.click();
//			Thread.sleep(2000);
//			pdpo.getEdit_under_date_field().click();
//			WebElement entering_date = pdpo.getEditing_date().get(0);
//			entering_date.sendKeys("12/16/02");
//			pdpo.getOk_text().click();
//		}
		

		ta.press(PointOption.point(466, 1626)).moveTo(PointOption.point(477, 781))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).release().perform();
		System.out.println("Swiped succesfully");
		Thread.sleep(2000);
		WebElement date = pdpo.getDatefield();
		date.click();
		pdpo.getEdit_under_date_field().click();
		pdpo.getEditing_date().sendKeys("1/2/02");
		pdpo.getOk_text().click();
		Thread.sleep(3000);
		WebElement address = pdpo.getAddress_field();
		address.clear();
		address.sendKeys("f30, mumbai, bandra east");
		WebElement pincode = pdpo.getPincode_field();
		pincode.clear();
		pincode.sendKeys("110091");
		Thread.sleep(2000);
		pdpo.getSave_btn().click();
		Thread.sleep(5000);

	}
}

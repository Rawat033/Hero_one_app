package com.oneapp.page_actions;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.oneapp.basic.Generic;
import com.oneapp.pageobjects.MyProfile_Page_Object;
import com.oneapp.pageobjects.Personal_Details_Page_Object;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
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

	public void fullName_field() throws InterruptedException {
		Thread.sleep(4000);
		WebElement fullname_field = pdpo.getFullname_textfield();
		fullname_field.clear();
	}

	public void EnterfullName() {
		Generic.sendkeys_element(pdpo.getFullname_textfield(), "Gunjan Rawat");
	}

	public void Gender_radio_button() throws InterruptedException {
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
//		ta.press(PointOption.point(534, 1349)).moveTo(PointOption.point(538, 792))
//				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).release().perform();
//		System.out.println("Swiped succesfully");
//		Thread.sleep(5000);
	}

	public void Email_field() throws InterruptedException {
		WebElement email = pdpo.getEmailfield();
		email.clear();
	}

	public void enter_email() throws InterruptedException {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000);
		pdpo.getEmailfield().sendKeys("gunjanrawat" + randomInt + "@gmail.com");

		System.out.println("*************************************");
		Thread.sleep(4000);
//		ta.press(PointOption.point(466, 1626)).moveTo(PointOption.point(477, 781))
//				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).release().perform();
//		System.out.println("Swiped succesfully");
//		Thread.sleep(2000);
	}

	public void enter_invalid_email() {
		
		Generic.sendkeys_element(pdpo.getEmailfield(), "abncasdasd");
		
	}

	public void Date_field() throws InterruptedException {
		WebElement date = pdpo.getDatefield();
		date.click();
		pdpo.getEdit_under_date_field().click();
		Generic.sendkeys_element(pdpo.getEditing_date(), "1/2/02");
		pdpo.getOk_text().click();
		Thread.sleep(3000);
	}

	public void invalid_date() throws InterruptedException {
		WebElement date = pdpo.getDatefield();
		date.click();
		pdpo.getEdit_under_date_field().click();
		Generic.sendkeys_element(pdpo.getEditing_date(), "1/2/23");
		pdpo.getOk_text().click();
		Thread.sleep(3000);
	}

	public void Address_field() {
		WebElement address = pdpo.getAddress_field();
		address.clear();
	}

	public void enter_address() {
		Generic.sendkeys_element(pdpo.getAddress_field(), "f30, mumbai, bandra east");
	}

	public void enter_invalid_address() {
		Generic.sendkeys_element(pdpo.getAddress_field(), "f30, mumbai, bandra east +++++++@#%^^&%^*!@#$@#$%^*^(");
	}

	public void Pincode_field() throws InterruptedException {
		Generic.swiping(534, 1349, 538, 792, 4000);
		Generic.swiping(466, 1626, 477, 781, 4000);
		WebElement pincode = pdpo.getPincode_field();
		pincode.clear();

	}

	public void enter_pincode() throws InterruptedException {
		Generic.sendkeys_element(pdpo.getPincode_field(), "110091");
		Thread.sleep(2000);
	}

	public void enter_invalid_pincode() throws InterruptedException {
		Thread.sleep(2000);
		Generic.sendkeys_element(pdpo.getPincode_field(), "000000");
		Thread.sleep(2000);
	}

	public void click_Save_button() throws InterruptedException {
		pdpo.getSave_btn().click();
		Thread.sleep(4000);
	}

//	public void Personal_details_page() throws InterruptedException {
//
////		Thread.sleep(4000);
////		WebElement fullname_field = pdpo.getFullname_textfield();
////		fullname_field.clear();
////		fullname_field.sendKeys("Gunjan Rawat");
////		WebElement gender_selection = pdpo.getGender_checkbox();
////
////		if (gender_selection.isSelected()) {
////			System.out.println("Female is already selected");
////		}
////
////		else {
////			gender_selection.click();
////			System.out.println("Female was not selected earlier but now it has been selected");
////		}
////
////		ta = new TouchAction(ad);
////		Thread.sleep(3000);
////		ta.press(PointOption.point(534, 1349)).moveTo(PointOption.point(538, 792))
////				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).release().perform();
////		System.out.println("Swiped succesfully");
////		Thread.sleep(5000);
//
////		WebElement email = pdpo.getEmailfield();
////		email.clear();
////		
////		Random randomGenerator = new Random();  
////		int randomInt = randomGenerator.nextInt(10000);  
////		email.sendKeys("gunjanrawat"+ randomInt +"@gmail.com"); 
////		
////		System.out.println("*************************************");
////		Thread.sleep(4000);
//
////		if (pdpo.getDatefield().getText().contains("20")) 
////		{
////			System.out.println("Date has already selected");
////		}
////
////		else {
////			Thread.sleep(2000);		
////			WebElement date_field = pdpo.getDatefield();
////			date_field.click();
////			Thread.sleep(2000);
////			pdpo.getEdit_under_date_field().click();
////			WebElement entering_date = pdpo.getEditing_date().get(0);
////			entering_date.sendKeys("12/16/02");
////			pdpo.getOk_text().click();
////		}
//
////		ta.press(PointOption.point(466, 1626)).moveTo(PointOption.point(477, 781))
////				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).release().perform();
////		System.out.println("Swiped succesfully");
////		Thread.sleep(2000);
////		WebElement date = pdpo.getDatefield();
////		date.click();
////		pdpo.getEdit_under_date_field().click();
////		pdpo.getEditing_date().sendKeys("1/2/02");
////		pdpo.getOk_text().click();
////		Thread.sleep(3000);
////		WebElement address = pdpo.getAddress_field();
////		address.clear();
////		address.sendKeys("f30, mumbai, bandra east");
////		WebElement pincode = pdpo.getPincode_field();
////		pincode.clear();
////		pincode.sendKeys("110091");
////		Thread.sleep(2000);
////		pdpo.getSave_btn().click();
////		Thread.sleep(5000);
//
//	}
}

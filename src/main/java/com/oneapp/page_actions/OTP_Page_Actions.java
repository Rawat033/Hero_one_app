package com.oneapp.page_actions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oneapp.basic.Create_Driver_Session;
import com.oneapp.pageobjects.Login_Page_Object;
import com.oneapp.pageobjects.OTP_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class OTP_Page_Actions {

	public AndroidDriver ad;

	public OTP_Page_Object opo;

	public OTP_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		opo = new OTP_Page_Object(ad);
	}

	public void Validate_OTP() throws InterruptedException {
		/*
		WebElement firstbox = opo.getFirsttxtbox();
		firstbox.clear();
		firstbox.sendKeys("1");
		WebElement secondbox = opo.getSecondtxtbox();
		secondbox.clear();
		secondbox.sendKeys("2");
		WebElement thirdbox = opo.getThirdtxtbox();
		thirdbox.clear();
		thirdbox.sendKeys("3");
		WebElement fourthbox = opo.getFourthtxtbox();
		fourthbox.clear();
		fourthbox.sendKeys("4");
		WebElement fifthbox = opo.getFifthtxtbox();
		fifthbox.clear();
		fifthbox.sendKeys("5");
		WebElement sixbox = opo.getSixthtxtbox();
		sixbox.clear();
		sixbox.sendKeys("6");
		*/
		Thread.sleep(5000);
		
		opo.getFirsttxtbox().sendKeys("1");
		opo.getSecondtxtbox().sendKeys("2");
		opo.getThirdtxtbox().sendKeys("3");
		opo.getFourthtxtbox().sendKeys("4");
		opo.getFifthtxtbox().sendKeys("5");
		opo.getSixthtxtbox().sendKeys("6");

	}

	public void invalid_Validate_OTP() {
		opo.getFirsttxtbox().sendKeys("1");
		opo.getSecondtxtbox().sendKeys("2");
		opo.getThirdtxtbox().sendKeys("3");
		opo.getFourthtxtbox().sendKeys("4");
		opo.getFifthtxtbox().sendKeys("5");
		opo.getSixthtxtbox().sendKeys("8");
	}

	public void Click_verify_button() {
		opo.getVerifybtn().click();
	}

	public void assertion_invalid_OTP() {
		String expected_toast_message = "Invalid Otp";
		String actual_toast_message = opo.getToast_message().getAttribute("name");
//			System.out.println(actual_toast_message);
		Assert.assertEquals(expected_toast_message, actual_toast_message);
	}

	public void assertion_valid_OTP_with_no_internet() {
		String expected_toast_message = "Please check your network connection.";
		String actual_toast_message = opo.getToast_message().getAttribute("name");
//			System.out.println(actual_toast_message);
		Assert.assertEquals(expected_toast_message, actual_toast_message);

	}

	public void Click_edit() {
		opo.getEdit_button().click();
	}

	public void click_resend_link() throws InterruptedException {
		opo.getResend_link().click();
		Thread.sleep(3000);
	}

}

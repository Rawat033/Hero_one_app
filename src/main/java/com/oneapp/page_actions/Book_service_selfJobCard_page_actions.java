package com.oneapp.page_actions;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.oneapp.pageobjects.Book_service_selfJobCard_page_object;
import com.oneapp.pageobjects.Select_Service_Center_Page_Object;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Book_service_selfJobCard_page_actions {

	public AndroidDriver ad;
	public TouchAction action;
	public Book_service_selfJobCard_page_object bssjcpo;

	public Book_service_selfJobCard_page_actions(AndroidDriver ad) {
		this.ad = ad;
		bssjcpo = new Book_service_selfJobCard_page_object(ad);
	}

	public void Self_Job_Card_Page() throws InterruptedException {
		String str = "Self Job Card";
		Reporter.log(bssjcpo.getSelf_job_card_text().getText(), true);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(bssjcpo.getSelf_job_card_text().getText(), str);

		String str1 = "Key Issues";
		Reporter.log(bssjcpo.getKey_issues_text().getText(), true);
		sa.assertEquals(bssjcpo.getKey_issues_text().getText(), str1);

		Thread.sleep(4000);

		String str3 = "Service";
		if (bssjcpo.getService_text().getText().equals(str3)) {
			bssjcpo.getService_radio_button().click();
			Thread.sleep(5000);
		}

		else {
			System.out.println("Service text is not avaiable on the page");
		}

		bssjcpo.getOther_issues_textbox().sendKeys("Testing");

	}

}

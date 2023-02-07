package com.oneapp.page_actions;

import org.openqa.selenium.WebDriver;

import com.oneapp.pageobjects.Book_service_selfJobCard_page_object;
import com.oneapp.pageobjects.Booking_confirmed_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Booking_confirmed_Page_Action {

	public WebDriver driver;
	public AndroidDriver ad;
	public TouchAction action;
	public Booking_confirmed_Page_Object bcpo;

	public Booking_confirmed_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		bcpo = new Booking_confirmed_Page_Object(ad);
	}
	
	public void fetching_SR_number()
	{
		System.out.println(bcpo.getSR_Number().getText());
	}
	
	
	public void click_go_back_to_home() throws InterruptedException
	{
		bcpo.getGo_back_to_home_link().click();
		Thread.sleep(10000);
	}
	
	/*public static void RT_portal(WebDriver driver) throws InterruptedException
	{
		com.oneapp.base.BaseClass_Webdriver.launch_Browser(driver);
		com.oneapp.test_layer.Login_Page_Test.Valid_Login(driver);
		com.oneapp.object_repo.Menu_Bar.Service(driver);
		com.oneapp.object_repo.Search_Bar.find(driver);
		com.oneapp.object_repo.Search_result.Siebel_Find(driver);
	}
	*/
}

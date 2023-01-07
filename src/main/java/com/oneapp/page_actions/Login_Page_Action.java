package com.oneapp.page_actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;
import com.oneapp.basic.Create_Driver_Session;
import com.oneapp.basic.ExcelData;
import com.oneapp.pageobjects.Contact_Us_page_object;
import com.oneapp.pageobjects.Login_Page_Object;
import com.oneapp.pageobjects.Privacy_Policy_Page_Object;
import com.oneapp.pageobjects.Terms_and_condition_Page_Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Login_Page_Action {

	public  AndroidDriver ad;
	public ExcelData exceldata;

	public Login_Page_Object lpo;
	public TouchAction ta;
	public Privacy_Policy_Page_Object pppo;
	public Terms_and_condition_Page_Object tcpo;
	public Contact_Us_page_object cupo;

//	String mob_num = "8800996793";
//	String mob_num1 = "995859217";
	
	public void WifiOff() {
	    ConnectionState state = ad.setConnection(new ConnectionStateBuilder().withWiFiDisabled().build());
	    Assert.assertFalse(state.isWiFiEnabled(), "Wifi is not switched off");
	    Reporter.log("WiFi turned off");
	} 
	
	public void WifiOn() {
	    ConnectionState state = ad.setConnection(new ConnectionStateBuilder().withWiFiEnabled().build());
	    Assert.assertTrue(state.isWiFiEnabled(), "Wifi is not switched on");
	    Reporter.log("WiFi turned on");
	}
	
	public void Run_app_in_background() throws InterruptedException
	{
		((AndroidDriver)ad).runAppInBackground(Duration.ofSeconds(15));
		Thread.sleep(5000);
	}

	public Login_Page_Action(AndroidDriver ad) {
		this.ad = ad;
		lpo = new Login_Page_Object(ad);
		pppo =new Privacy_Policy_Page_Object(ad);
		 tcpo = new Terms_and_condition_Page_Object(ad);
		cupo=new Contact_Us_page_object(ad);
		 exceldata= new ExcelData();	 
	}

	
//	@DataProvider(name="LoginTestData")
//	public Object[][] Login_Data_provider()
//	{
//		Object[][] data = new Object[2][2];
//		data[0][0]= "9958592171";
//		data[1][0]= "0002272829";
//		data[2][0]= "972827";
//		data[3][0]= "99hajckdiw";
//		data[4][0]= "999&ueisj0";
//		
//		return data;
//		
//	}
	
	public void validate_login() throws InterruptedException {
//		ad.isAppInstalled("com.customerapp.hero");   //for checking app is installed or not?
//		ad.lockDevice();
//		System.out.println(ad.isDeviceLocked());
//		ad.unlockDevice();
//		Thread.sleep(5000);
		ta = new TouchAction(ad);
		String actuallogo = lpo.getHerologo().getText();
		String Expectedlogo = "Login";
		Assert.assertEquals(actuallogo, Expectedlogo);
		System.out.println("My Validation has passed");
		System.out.println(lpo.getHerologo().getText());
		WebElement mob_num = lpo.getMobile_num_field();
		mob_num.clear();
		mob_num.sendKeys(exceldata.getStringData("Login Page", 0, 0));
		lpo.getlogin_btn().click();
	//	ad.findElementByXPath("//*[@text='Continue']").click();
		Thread.sleep(5000);
		
	}

	public void Invalidate_login() throws InterruptedException {

		WebElement hlogo = lpo.getHerologo();
		ta = new TouchAction(ad);
		String Expectedlogo = "Login";
		Assert.assertEquals(hlogo.getText(), Expectedlogo);

		StringBuilder sb = new StringBuilder();
		StringBuilder rev = sb.append(exceldata.getStringData("Login Page",0,0));
		StringBuilder reverse = rev.reverse();
	    
		lpo.getMobile_num_field().sendKeys(reverse);
		Thread.sleep(10000);
	//	ta.tap(TapOptions.tapOptions().withPosition(PointOption.point(538, 1831))).perform();
		lpo.getlogin_btn().click();
	}

	public void Mininum_length_field() throws InterruptedException {

		WebElement Enter_mob_num = lpo.getMobile_num_field();
		
		Enter_mob_num.sendKeys(exceldata.getStringData("Login Page",2,0));

		if (exceldata.getStringData("Login Page",2,0).contains("9958")) {
			Thread.sleep(3000);
			boolean enabl_btn = lpo.getlogin_btn().isEnabled();
			System.out.println("Button is disabled "+ enabl_btn);
		}

		else {
			System.out.println("button is still enable and my test is getting failed");
			Thread.sleep(2000);
	//		ta.tap(TapOptions.tapOptions().withPosition(PointOption.point(538, 1831))).perform();
			lpo.getlogin_btn().click();
		}

//    Thread.sleep(2000);
//    ta.tap(TapOptions.tapOptions().withPosition(PointOption.point(538, 1831))).perform();

	}

	public void Swipe_Login_page() throws InterruptedException
	{
		ta = new TouchAction(ad);
		Thread.sleep(12000);

		ta.press(PointOption.point(573, 1618)).moveTo(PointOption.point(569, 1126))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).release().perform();
		Thread.sleep(7000);
	}
	

	public void Privacypage() throws InterruptedException {
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getPrivacylink().get(7)))).perform();
		System.out.println("Privacy gets clicked");
		Thread.sleep(10000);
		WebElement get_privacy_text = pppo.getPrivacytext_val().get(21);
		//WebElement get_privacy_text = lpo.getPrivacytext_val().get(21); // - it is for emulator
		// WebElement get_privacy_text = lpo.getPrivacytext_val().get(3); // it is for
		// real devices
		System.out.println("HOGYA");
		boolean Privacy_displaying = get_privacy_text.isDisplayed();
		System.out.println(Privacy_displaying);
	}
	
	public void Terms_and_Conditionspage() throws InterruptedException
	{
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getTerm_and_condition_link().get(5)))).perform();
		System.out.println("Terms and conditions link gets clicked");
		Thread.sleep(15000);
		WebElement get_T_and_C_text = tcpo.getTerms_and_conditions_text_val().get(21);
		System.out.println("FIRSE_HOGYA");
		boolean T_and_C_displaying = get_T_and_C_text.isDisplayed();
		System.out.println(T_and_C_displaying);
		
		
	}
	
	
	public void Contact_Us() throws InterruptedException
	{
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(lpo.getContact_us_link().get(9)))).perform();
		System.out.println("Contact us link gets clicked");
		Thread.sleep(12000);
		System.out.println("FIRSE_HOGYA");
		WebElement get_contact_us_text = cupo.getContact_us_text_val().get(1);
		boolean Contact_us_displaying = get_contact_us_text.isDisplayed();
		System.out.println(Contact_us_displaying);
		
	}
	
 
	
	
	
	
	
	
	
	
	
	
	

}

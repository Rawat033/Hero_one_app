package com.oneapp.page_actions;

import java.io.File;
import java.io.IOException;

import com.oneapp.pageobjects.Driving_License_Page_Object;
import com.oneapp.pageobjects.MyProfile_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Driving_License_Page_Actions {
	
	public AndroidDriver ad;
	public Driving_License_Page_Object dlpo;
    public TouchAction ta;
    
	public Driving_License_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		dlpo = new Driving_License_Page_Object(ad);
	}
	
	
	public void click_three_dots()
	{
		dlpo.getThree_dots().click();
		
	}
	
	public void uploading_new() throws InterruptedException, IOException
	{
		 ta = new TouchAction(ad);
		 Thread.sleep(3000);
		 ta.tap(TapOptions.tapOptions().withPosition(PointOption.point(819, 277))).perform();
		 dlpo.getTake_pictures_pop_up().click();
		 dlpo.getAcess_photos_and_medio_pop_up().click();
		 Thread.sleep(3000);
		 dlpo.getThree_dots().click();
		 Thread.sleep(3000);
		 ta.tap(TapOptions.tapOptions().withPosition(PointOption.point(819, 277))).perform();
		 dlpo.getChoose_from_library_btn().click();
	//	 ad.pushFile("/sdcard/Download/images.jpg", new File("D:\\JAVA\\Insta.jpg"));
		 ad.pullFile("/sdcard/Download/images.jpg");
		 Thread.sleep(10000);
		 dlpo.getImage_under_emulator().click();
		 Thread.sleep(4000);
		 dlpo.getCrop_image().click();
		 Thread.sleep(3000);	 
	}
	
	public void click_back_button()
	{
		dlpo.getBack_btn().click();
	}

}

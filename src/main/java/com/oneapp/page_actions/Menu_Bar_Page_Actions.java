package com.oneapp.page_actions;

import com.oneapp.pageobjects.Dashboard_Page_object;
import com.oneapp.pageobjects.Menu_Bar_Page_Object;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Menu_Bar_Page_Actions {

	public AndroidDriver ad;
	public Menu_Bar_Page_Object mbpo;

	public Menu_Bar_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		mbpo = new Menu_Bar_Page_Object(ad);
	}
	
	public void Myprofile_Menu_bar() throws InterruptedException
	{
		Thread.sleep(3000);
		mbpo.getMyprofile_menu_bar_txt().click();
	}

	public void Tips_and_DIY_Menu_bar() throws InterruptedException
	{
		Thread.sleep(2000);
		mbpo.getTips_and_DIY_videos_menu_bar_text().click();
		Thread.sleep(4000);
	}
	
	 public void logout_Menu_bar()
	 {
		 mbpo.getLogout_menu_bar_txt().click();
	 }
	
	 public void closing_menubar_icon() throws InterruptedException
	 {
		 mbpo.getMenu_bar_close_icon().click();
		 Thread.sleep(3000);
	 }
	

}

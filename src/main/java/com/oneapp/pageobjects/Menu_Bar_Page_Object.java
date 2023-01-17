package com.oneapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Menu_Bar_Page_Object {
	
	@FindBy(id = "com.customerapp.hero:id/rv_item_lbl")
	private WebElement myprofile_menu_bar_txt;
	
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView")
	private WebElement Tips_and_DIY_videos_menu_bar_text;
	
	@FindBy(xpath = "//*[@text='Logout']")
	private WebElement logout_menu_bar_txt;
	

	@FindBy(id = "com.customerapp.hero:id/cross")
	private WebElement menu_bar_close_icon;
	
	
	public Menu_Bar_Page_Object(AndroidDriver ad) {

		PageFactory.initElements(ad, this);

	}


	public WebElement getMyprofile_menu_bar_txt() {
		return myprofile_menu_bar_txt;
	}


	public WebElement getTips_and_DIY_videos_menu_bar_text() {
		return Tips_and_DIY_videos_menu_bar_text;
	}


	public WebElement getLogout_menu_bar_txt() {
		return logout_menu_bar_txt;
	}


	public WebElement getMenu_bar_close_icon() {
		return menu_bar_close_icon;
	}


	


	
	

}

package com.oneapp.page_actions;

import com.oneapp.pageobjects.Goodlife_Dashboard_Non_mem_Page_Object;
import com.oneapp.pageobjects.Goodlife_Plans_Page_Object;

import io.appium.java_client.android.AndroidDriver;

public class Goodlife_Plans_Page_Actions {
	
	public AndroidDriver ad;
	public Goodlife_Plans_Page_Object gppo;

	
	public Goodlife_Plans_Page_Actions(AndroidDriver ad) {
		this.ad = ad;
		gppo = new Goodlife_Plans_Page_Object(ad);
	}

	public void click_on_view_all_benefits()
	{
		gppo.getViewallbenefits_goodlife_plans().click();
	}

}

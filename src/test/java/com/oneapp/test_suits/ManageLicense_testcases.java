package com.oneapp.test_suits;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Driving_License_Page_Actions;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.Myprofile_Page_Actions;

@Listeners(com.oneapp.basic.MyListeners.class)

public class ManageLicense_testcases extends BrowserFactory {
	
	@Test // (priority=5, groups={"smoke"})
	public void validation_manage_licence_testcase() throws InterruptedException, IOException {

		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.click_manage_licence();
		Driving_License_Page_Actions dlpa = new Driving_License_Page_Actions(ad);
		dlpa.click_three_dots();
		dlpa.uploading_new();
		System.out.println("**********************");
		System.out.println("validation_manage_licence_testcase Passed");
		dlpa.click_back_button();
		mppa.click_back_icon();
		Menu_Bar_Page_Actions mbpa=new Menu_Bar_Page_Actions(ad);
		mbpa.closing_menubar_icon();

	}

}

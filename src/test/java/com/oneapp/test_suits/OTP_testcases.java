package com.oneapp.test_suits;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Logout_Page_Actions;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;

@Listeners(com.oneapp.basic.MyListeners.class)


public class OTP_testcases extends BrowserFactory {
	
	@Test // (priority = 2, groups = { "smoke" })
	public void validate_OTP_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validate_login();
		System.out.println("OTP page");
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.Validate_OTP();
		opa.Click_verify_button();
		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
		svpa.Assertion_selected_vehicle_page();
		svpa.Vehicle_Select();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.Handling_Dashboard_All_Popups();
		dpa.MenubarList();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.logout_Menu_bar();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.click_yes_under_logout();
		System.out.println("**********************");
		System.out.println("Verify_OTP_testcase100 Passed");
	}
	
	
	@Test //(priority = 1, groups = { "negative" })
	public void validate_invalid_OTP_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validate_login();
		System.out.println("OTP page");
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.invalid_Validate_OTP();
		opa.Click_verify_button();
		opa.assertion_invalid_OTP();
	}
	
	@Test (priority = 1, groups = { "negative" })
	public void validate_OTP_after_resend_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validate_login();
		System.out.println("OTP page");
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.Validate_OTP();
		opa.click_resend_link();
		opa.Validate_OTP();
		opa.Click_verify_button();
		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
		svpa.Assertion_selected_vehicle_page();
		svpa.Vehicle_Select();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		dpa.Handling_Dashboard_All_Popups();
		dpa.MenubarList();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.logout_Menu_bar();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.click_yes_under_logout();
		System.out.println("**********************");
		System.out.println("Verify_OTP_testcase100 Passed");
	}
	
	
	

}

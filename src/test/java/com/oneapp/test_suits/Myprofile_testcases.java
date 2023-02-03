package com.oneapp.test_suits;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.basic.Generic;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Logout_Page_Actions;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.Myprofile_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.Personal_Details_Page_Actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;

@Listeners(com.oneapp.basic.MyListeners.class)

public class Myprofile_testcases extends BrowserFactory{
	
	@Test //(priority = 1, groups = { "negative" })
	public void validate_myprofile_valid_details_testcase400() throws InterruptedException {
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
		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.Profiledetails_val();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
//		pdpa.Personal_details_page();
		pdpa.fullName_field();
		pdpa.EnterfullName();
		pdpa.Gender_radio_button();
		pdpa.Email_field();
		pdpa.enter_email();
		pdpa.Date_field();
		pdpa.Address_field();
		pdpa.enter_address();
		pdpa.Pincode_field();
		pdpa.enter_pincode();
		pdpa.click_Save_button();
		mppa.profile_details_after_saving_validation();
		mppa.click_back_icon();
		mbpa.logout_Menu_bar();
		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
		lgpa.click_yes_under_logout();
		System.out.println("**********************");
		System.out.println("Myprofile_changes_Validation_testcase400 Passed");
	}
	
	@Test //(priority = 1, groups = { "negative" })
	public void Validate_saving_with_blank_fullName_field() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validate_login();
//		System.out.println("OTP page");
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
		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.Profiledetails_val();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.fullName_field();
		pdpa.EnterfullName();
		pdpa.click_Save_button();
		System.out.println("**********************");
		System.out.println("Validate_saving_with_blank_fullName_field Passed");
	}
	
	
	@Test //(priority = 1, groups = { "negative" })
	public void Validate_saving_with_blank_email_field() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validate_login();
//		System.out.println("OTP page");
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
		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.Profiledetails_val();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.Email_field();
		pdpa.click_Save_button();
		System.out.println("**********************");
		System.out.println("Validate_saving_with_blank_fullName_field Passed");
	}
	
		
	@Test //(priority = 1, groups = { "negative" })
	public void Validate_saving_with_invalid_email_field() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validate_login();
//		System.out.println("OTP page");
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
		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.Profiledetails_val();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.Email_field();
		pdpa.enter_invalid_email();
		pdpa.click_Save_button();
		System.out.println("**********************");
		System.out.println("Validate_saving_with_blank_fullName_field Passed");
	}
	
	
	@Test //(priority = 1, groups = { "negative" })
	public void Validate_saving_with_invalid_dateofbirth_field() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validate_login();
//		System.out.println("OTP page");
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
		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.Profiledetails_val();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.invalid_date();
		System.out.println("**********************");
		System.out.println("Validate_saving_with_blank_fullName_field Passed");
	}
	
	
	@Test //(priority = 1, groups = { "negative" })
	public void Validate_saving_with_invalid_address_field() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validate_login();
//		System.out.println("OTP page");
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
		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.Profiledetails_val();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.Address_field();
		pdpa.enter_invalid_address();
		System.out.println("**********************");
		System.out.println("Validate_saving_with_blank_fullName_field Passed");
	}
	
	
	@Test (priority = 1, groups = { "negative" })
	public void Validate_saving_with_invalid_pincode_field() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validate_login();
//		System.out.println("OTP page");
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
		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.Profiledetails_val();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.Pincode_field();
		pdpa.enter_invalid_pincode();
		System.out.println("**********************");
		System.out.println("Validate_saving_with_invalid_pincode_field Passed");
	}
	
	@Test //(priority = 1, groups = { "negative" })
	public void Validate_save_button_with_no_internet() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validate_login();
//		System.out.println("OTP page");
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
		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.Profiledetails_val();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		Generic.WifiOff();
		pdpa.click_Save_button();
		Generic.WifiOn();
		System.out.println("**********************");
		System.out.println("Validate_saving_with_blank_fullName_field Passed");
	}

}

package com.oneapp.test_suits;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Book_service_selfJobCard_page_actions;
import com.oneapp.page_actions.Book_service_service_center_page_actions;
import com.oneapp.page_actions.Booking_confirmed_Page_Action;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Select_Service_Center_Page_Actions;
import com.oneapp.page_actions.Vehicle_Service_Page_actions;

@Listeners(com.oneapp.basic.MyListeners.class)

public class BookService_testcases extends BrowserFactory {

	@Test // (priority = 7, groups = { "smoke" })
	public void validate_Bookservice_FSC_testcase() throws InterruptedException {
//		Login_Page_Action lpa = new Login_Page_Action(ad);
//		lpa.validate_login();
//		System.out.println("OTP page");
//		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
//		opa.Validate_OTP();
//		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
//		svpa.Vehicle_Select();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		// dpa.Handling_Dashboard_All_Popups();
		dpa.Services_icon();
		Vehicle_Service_Page_actions vspa = new Vehicle_Service_Page_actions(ad);
		vspa.Book_service_button();
		Book_service_service_center_page_actions bsscpa = new Book_service_service_center_page_actions(ad);
		bsscpa.Select_Service_Center();
		Select_Service_Center_Page_Actions sscpa = new Select_Service_Center_Page_Actions(ad);
		sscpa.Selecting_Service_center_process();
		bsscpa.ServiceType_and_continue_btn();
		bsscpa.Verifying_service_type();
		Book_service_selfJobCard_page_actions bssjcpa = new Book_service_selfJobCard_page_actions(ad);
		bssjcpa.Self_Job_Card_Page();
		Booking_confirmed_Page_Action bcpa = new Booking_confirmed_Page_Action(ad);
		bcpa.fetching_SR_number();
		bcpa.click_go_back_to_home();
//		dpa.MenubarList();
//		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
//		mbpa.logout_Menu_bar();
//		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
//		lgpa.click_yes_under_logout();
		System.out.println("**********************");
		System.out.println("Bookservice_FSC_testcase Passed");

	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

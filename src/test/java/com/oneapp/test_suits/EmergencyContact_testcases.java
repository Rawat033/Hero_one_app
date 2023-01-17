package com.oneapp.test_suits;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Emergency_contact_details_page_actions;
import com.oneapp.page_actions.Emergency_contact_page_actions;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.Myprofile_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;

@Listeners(com.oneapp.basic.MyListeners.class)

public class EmergencyContact_testcases extends BrowserFactory {

	@Test //(priority = 3, groups = { "smoke" })
	public void validate_emergency_contact_added_succesfully_testcase() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validate_login();
		System.out.println("OTP page");
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.Validate_OTP();
		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
		svpa.Vehicle_Select();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
	//	dpa.Handling_Dashboard_All_Popups();
		dpa.MenubarList();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
		mppa.Emergency_contact();
		Emergency_contact_page_actions ecpa = new Emergency_contact_page_actions(ad);
		ecpa.Adding_emergency_contact();
		Emergency_contact_details_page_actions ecdpa = new Emergency_contact_details_page_actions(ad);
		ecdpa.filling_emergency_contact_details();
		ecpa.saved_contact_val();
		System.out.println("**********************");
		System.out.println("Emergency_contact_added_succesfully_testcase Passed");

	}

	@Test //(priority = 4, groups = { "smoke" })
	public void validate_emergency_contact_deleted_succesfully_testcase() throws InterruptedException {
//    		Login_Page_Action lpa= new Login_Page_Action(ad);
//    		lpa.validate_login();
//    		System.out.println("OTP page");
//    		OTP_Page_Actions opa= new OTP_Page_Actions(ad);
//    		opa.Validate_OTP();		
//    		Selected_Vehicle_Page_Actions svpa= new Selected_Vehicle_Page_Actions(ad);
//    		svpa.Vehicle_Select();
//    		Dashboard_Page_Actions dpa=new Dashboard_Page_Actions(ad);
//    		dpa.Handling_Dashboard_All_Popups();
//    		dpa.MenubarList();
		Menu_Bar_Page_Actions mbpa = new Menu_Bar_Page_Actions(ad);
//    		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa = new Myprofile_Page_Actions(ad);
//    		mppa.Emergency_contact();

		Emergency_contact_page_actions ecpa = new Emergency_contact_page_actions(ad);
		ecpa.Deleting_contact();
		System.out.println("**********************");
		System.out.println("Emergency_contact_deleted_succesfully Passed");
		ecpa.click_back_icon();
//		mppa.click_back_icon();
//		mbpa.logout_Menu_bar();
//		Logout_Page_Actions lgpa = new Logout_Page_Actions(ad);
//		lgpa.click_yes_under_logout();
//		System.out.println("**********************");
//		System.out.println("Emergency_contact_deleted_succesfully_testcase Passed");
	}
}

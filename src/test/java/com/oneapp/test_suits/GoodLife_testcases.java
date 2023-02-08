package com.oneapp.test_suits;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Goodlife_Dashboard_Non_mem_Page_Actions;
import com.oneapp.page_actions.Goodlife_Plans_Page_Actions;
import com.oneapp.page_actions.Goodlife_Profile_Details_Form_199_Page_Action;
import com.oneapp.page_actions.Goodlife_Select_Your_Plan_Page_Action;

@Listeners(com.oneapp.basic.MyListeners.class)

public class GoodLife_testcases extends BrowserFactory {
	
	@Test //(priority = 6, groups = { "smoke" })
	public void validate_Goodlife_Non_member_asOwner_testcase() throws InterruptedException {
//		Login_Page_Action lpa = new Login_Page_Action(ad);
//		lpa.validate_login();
//		System.out.println("OTP page");
//		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
//		opa.Validate_OTP();
//		Selected_Vehicle_Page_Actions svpa = new Selected_Vehicle_Page_Actions(ad);
//		svpa.Vehicle_Select();
		Dashboard_Page_Actions dpa = new Dashboard_Page_Actions(ad);
		// dpa.Handling_Dashboard_All_Popups();
		dpa.Goodlife_icon();
		Goodlife_Dashboard_Non_mem_Page_Actions gdnmpa = new Goodlife_Dashboard_Non_mem_Page_Actions(ad);
		gdnmpa.Goodlife_dashboard_button();
		Goodlife_Plans_Page_Actions gppa = new Goodlife_Plans_Page_Actions(ad);
		gppa.click_on_view_all_benefits();
		Goodlife_Select_Your_Plan_Page_Action gsyppa = new Goodlife_Select_Your_Plan_Page_Action(ad);
		gsyppa.Selecting_Plan();
		Goodlife_Profile_Details_Form_199_Page_Action gpdf_199_pa = new Goodlife_Profile_Details_Form_199_Page_Action(
				ad);
		gpdf_199_pa.Profile_form_199_checkboxes_and_tap_pay_199_button();
		System.out.println("**********************");
		System.out.println("Goodlife_Nonmember_Owner_testcase Passed");

	}

}

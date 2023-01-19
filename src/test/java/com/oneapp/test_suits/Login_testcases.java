package com.oneapp.test_suits;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.Privacy_policy_Page_action;


@Listeners(com.oneapp.basic.MyListeners.class)

public class Login_testcases extends BrowserFactory {
	
	@Test// (priority = 1, groups = { "smoke" })
	public void Valid_Login_001() throws InterruptedException, IOException {
		System.out.println(ad.getSessionId());
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.validate_login();
		OTP_Page_Actions opa = new OTP_Page_Actions(ad);
		opa.Click_edit();
		System.out.println("**********************");
		System.out.println("Valid_Login_001 Passed");
	}

	@Test //(priority = 1, groups = { "negative" })
	public void invalid_Login_002() throws InterruptedException, IOException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.Invalidate_login();
		System.out.println("**********************");
		System.out.println("Valid_Login_001 Passed");
	}

	@Test //(priority = 1, groups = { "negative" })
	public void mininum_length_field_validation_003() throws InterruptedException, IOException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
//		System.out.println(ad.getSessionId());
		lpa.Mininum_length_field();
	}
	

	@Test //(priority = 2, groups = { "negative" })
	public void validate_continue_with_no_internet() throws InterruptedException, IOException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
//		System.out.println(ad.getSessionId());
		lpa.continue_with_no_internet();
	}
	

	@Test
	public void Privacy_validation_004() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.Swipe_Login_page();
		lpa.Privacypage();
	}

	@Test //(priority =1, groups = { "negative" })
	public void validation_privacypage_with_no_internet() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.Swipe_Login_page();
		lpa.Privacypage_with_no_internet();
		Privacy_policy_Page_action pppa=new Privacy_policy_Page_action(ad);
		pppa.assertion_privacy_policy_page();
		
	}
	
	@Test //(priority =1, groups = { "negative" })
	public void validation_app_working_expected_after_minimizing() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
	lpa.validate_login();
	lpa.App_minimizing_after_loggedin();
	OTP_Page_Actions opa= new OTP_Page_Actions(ad);
	opa.Click_edit();
		
	}
	
	@Test
	public void T_and_C_validation_005() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.Swipe_Login_page();
		lpa.Terms_and_Conditionspage();
	}

	@Test
	public void Contact_Us_005() throws InterruptedException {
		Login_Page_Action lpa = new Login_Page_Action(ad);
		lpa.Swipe_Login_page();
		lpa.Contact_Us();
	}

}

package com.oneapp.test_suits;

import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Logout_Page_Actions;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.SOS_alert_window_page_actions;
import com.oneapp.page_actions.SOS_page_actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;

public class SOS_testcases extends BrowserFactory {
	
	@Test (priority = 6, groups = { "smoke" })
	public void validate_SOS_message_sending_testcase() throws InterruptedException {
		
		SOS_page_actions SOS_pa= new SOS_page_actions(ad);
		SOS_pa.tapping_on_SOS_icon();
		SOS_alert_window_page_actions sosawpa= new SOS_alert_window_page_actions(ad);
		sosawpa.taping_on_send_alert_now_button();
		sosawpa.assert_SOS_message();
		System.out.println("**********************");
		System.out.println("validate_SOS_message_sending_testcase Passed");
	}

}

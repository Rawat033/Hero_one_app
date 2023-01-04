package com.oneapp.test_suits;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneapp.basic.BrowserFactory;
import com.oneapp.basic.Create_Driver_Session;
import com.oneapp.page_actions.Book_service_selfJobCard_page_actions;
import com.oneapp.page_actions.Book_service_service_center_page_actions;
import com.oneapp.page_actions.Dashboard_Page_Actions;
import com.oneapp.page_actions.Emergency_contact_details_page_actions;
import com.oneapp.page_actions.Emergency_contact_page_actions;
import com.oneapp.page_actions.Goodlife_Dashboard_Non_mem_Page_Actions;
import com.oneapp.page_actions.Goodlife_Plans_Page_Actions;
import com.oneapp.page_actions.Goodlife_Profile_Details_Form_199_Page_Action;
import com.oneapp.page_actions.Goodlife_Select_Your_Plan_Page_Action;
import com.oneapp.page_actions.Login_Page_Action;
import com.oneapp.page_actions.Menu_Bar_Page_Actions;
import com.oneapp.page_actions.Myprofile_Page_Actions;
import com.oneapp.page_actions.OTP_Page_Actions;
import com.oneapp.page_actions.Personal_Details_Page_Actions;
import com.oneapp.page_actions.Select_Service_Center_Page_Actions;
import com.oneapp.page_actions.Selected_Vehicle_Page_Actions;
import com.oneapp.page_actions.Vehicle_Service_Page_actions;

import io.appium.java_client.android.AndroidDriver;


//@Listeners(com.oneapp.basic.MyListeners.class)  

public class  Main_Methods extends BrowserFactory{
	
	@Test 
	public void Valid_Login_001() throws InterruptedException, IOException
	{
		System.out.println(ad.getSessionId());
		Login_Page_Action lpa=new Login_Page_Action(ad);
		lpa.validate_login();
//		lpa.Screenshot();
//		System.out.println("Screenshot has taken");
//		Thread.sleep(10000);
	}
	
	
	@Test 
	public void InValid_Login_002() throws InterruptedException, IOException
	{
		Login_Page_Action lpa=new Login_Page_Action(ad);
		System.out.println(ad.getSessionId());
		lpa.Invalidate_login();
	}
	
	@Test 
	public void Mininum_length_field_validation_003() throws InterruptedException, IOException
	{
		Login_Page_Action lpa=new Login_Page_Action(ad);
		System.out.println(ad.getSessionId());
		lpa.Mininum_length_field();
	
	}
	
	@Test 
	public void Privacy_validation_004() throws InterruptedException
	{
		Login_Page_Action lpa=new Login_Page_Action(ad);
		lpa.Swipe_Login_page();
		lpa.Privacypage();
	}
	
	@Test 
	public void T_and_C_validation_005() throws InterruptedException
	{
		Login_Page_Action lpa=new Login_Page_Action(ad);
		lpa.Swipe_Login_page();
		lpa.Terms_and_Conditionspage();
	}
	
	@Test 
	public void Contact_Us_005() throws InterruptedException
	{
		Login_Page_Action lpa=new Login_Page_Action(ad);
		lpa.Swipe_Login_page();
		lpa.Contact_Us();
	}
	
	
	@Test
	public void Verify_OTP_100() throws InterruptedException 
	{
		Login_Page_Action lpa= new Login_Page_Action(ad);
		lpa.validate_login();
		System.out.println("OTP page");
		OTP_Page_Actions opa= new OTP_Page_Actions(ad);
		opa.Validate_OTP();		
	}
	
	
	@Test 
	public void Vehicle_selected_succesfully_200() throws InterruptedException 
	{
		Login_Page_Action lpa= new Login_Page_Action(ad);
		lpa.validate_login();
		System.out.println("OTP page");
		OTP_Page_Actions opa= new OTP_Page_Actions(ad);
		opa.Validate_OTP();		
		Selected_Vehicle_Page_Actions svpa= new Selected_Vehicle_Page_Actions(ad);
		svpa.Vehicle_Select();
	}
	
 
	@Test 
	
	public void Dashboard_All_Popups_300() throws InterruptedException 
	{
		Login_Page_Action lpa= new Login_Page_Action(ad);
		lpa.validate_login();
		System.out.println("OTP page");
		OTP_Page_Actions opa= new OTP_Page_Actions(ad);
		opa.Validate_OTP();		
		Selected_Vehicle_Page_Actions svpa= new Selected_Vehicle_Page_Actions(ad);
		svpa.Vehicle_Select();
		Dashboard_Page_Actions dpa=new Dashboard_Page_Actions(ad);
		dpa.Handling_Dashboard_All_Popups();
	}
	
	@Test 
	public void Myprofile_changes_Validation_400() throws InterruptedException 
	{
		Login_Page_Action lpa= new Login_Page_Action(ad);
		lpa.validate_login();
		System.out.println("OTP page");
		OTP_Page_Actions opa= new OTP_Page_Actions(ad);
		opa.Validate_OTP();		
		Selected_Vehicle_Page_Actions svpa= new Selected_Vehicle_Page_Actions(ad);
		svpa.Vehicle_Select();
		Dashboard_Page_Actions dpa=new Dashboard_Page_Actions(ad);
		dpa.Handling_Dashboard_All_Popups();
		dpa.MenubarList();
		Menu_Bar_Page_Actions mbpa= new Menu_Bar_Page_Actions(ad);
		mbpa.Myprofile_Menu_bar();
		Myprofile_Page_Actions mppa=new Myprofile_Page_Actions(ad);
		mppa.Profiledetails_val();
		Personal_Details_Page_Actions pdpa = new Personal_Details_Page_Actions(ad);
		pdpa.Personal_details_page();
		mppa.profile_details_after_saving_validation();
	}
	
      @Test (enabled=false)
      public void Emergency_contact_added_succesfully() throws InterruptedException
      {
    		Login_Page_Action lpa= new Login_Page_Action(ad);
    		lpa.validate_login();
    		System.out.println("OTP page");
    		OTP_Page_Actions opa= new OTP_Page_Actions(ad);
    		opa.Validate_OTP();		
    		Selected_Vehicle_Page_Actions svpa= new Selected_Vehicle_Page_Actions(ad);
    		svpa.Vehicle_Select();
    		Dashboard_Page_Actions dpa=new Dashboard_Page_Actions(ad);
    		dpa.Handling_Dashboard_All_Popups();
    		dpa.MenubarList();
    		Menu_Bar_Page_Actions mbpa= new Menu_Bar_Page_Actions(ad);
    		mbpa.Myprofile_Menu_bar();
    		Myprofile_Page_Actions mppa=new Myprofile_Page_Actions(ad);
    		mppa.Emergency_contact();
    		Emergency_contact_page_actions ecpa= new Emergency_contact_page_actions(ad);
    		ecpa.Adding_emergency_contact();
    		Emergency_contact_details_page_actions ecdpa=new Emergency_contact_details_page_actions(ad);
    		ecdpa.filling_emergency_contact_details();
    		ecpa.saved_contact_val();
    		
      }
	
	
      @Test (dependsOnMethods = {"Emergency_contact_added_succesfully"})
      public void Emergency_contact_deleted_succesfully() throws InterruptedException
      {
    		Login_Page_Action lpa= new Login_Page_Action(ad);
    		lpa.validate_login();
    		System.out.println("OTP page");
    		OTP_Page_Actions opa= new OTP_Page_Actions(ad);
    		opa.Validate_OTP();		
    		Selected_Vehicle_Page_Actions svpa= new Selected_Vehicle_Page_Actions(ad);
    		svpa.Vehicle_Select();
    		Dashboard_Page_Actions dpa=new Dashboard_Page_Actions(ad);
    		dpa.Handling_Dashboard_All_Popups();
    		dpa.MenubarList();
    		Menu_Bar_Page_Actions mbpa= new Menu_Bar_Page_Actions(ad);
    		mbpa.Myprofile_Menu_bar();
    		Myprofile_Page_Actions mppa=new Myprofile_Page_Actions(ad);
    		mppa.Emergency_contact();
    		Emergency_contact_page_actions ecpa=new Emergency_contact_page_actions(ad);
    		ecpa.Deleting_contact();
      }
	
      
	 @Test 
	 public void Tips_Validation() throws InterruptedException
	 {
		Login_Page_Action lpa= new Login_Page_Action(ad);
 		lpa.validate_login();
 		System.out.println("OTP page");
 		OTP_Page_Actions opa= new OTP_Page_Actions(ad);
 		opa.Validate_OTP();		
 		Selected_Vehicle_Page_Actions svpa= new Selected_Vehicle_Page_Actions(ad);
 		svpa.Vehicle_Select();
 		Dashboard_Page_Actions dpa=new Dashboard_Page_Actions(ad);
 		dpa.Handling_Dashboard_All_Popups();
 		dpa.MenubarList();
 		Menu_Bar_Page_Actions mbpa=new Menu_Bar_Page_Actions(ad);
 		mbpa.Tips_and_DIY_Menu_bar();
	 }
      
	
	 @Test 
	 public void Bookservice_FSC() throws InterruptedException
	 {
		Login_Page_Action lpa= new Login_Page_Action(ad);
 		lpa.validate_login();
 		System.out.println("OTP page");
 		OTP_Page_Actions opa= new OTP_Page_Actions(ad);
 		opa.Validate_OTP();		
 		Selected_Vehicle_Page_Actions svpa= new Selected_Vehicle_Page_Actions(ad);
 		svpa.Vehicle_Select();
 		Dashboard_Page_Actions dpa=new Dashboard_Page_Actions(ad);
 		dpa.Handling_Dashboard_All_Popups();
 		dpa.Services_icon();
 		Vehicle_Service_Page_actions vspa = new Vehicle_Service_Page_actions(ad);
 		vspa.Book_service_button();
 		Book_service_service_center_page_actions bsscpa =new Book_service_service_center_page_actions(ad);
 		bsscpa.Select_Service_Center();
 		Select_Service_Center_Page_Actions sscpa= new Select_Service_Center_Page_Actions(ad);
 		sscpa.Selecting_Service_center_process();
 		bsscpa.ServiceType_and_continue_btn();
 		Book_service_selfJobCard_page_actions bssjcpa= new Book_service_selfJobCard_page_actions(ad);
 		bssjcpa.Self_Job_Card_Page();
	 }
	 
	 
	 @Test (priority=1, groups={"smoke"})
	 public void Goodlife_Nonmember_Owner() throws InterruptedException
	 {
		Login_Page_Action lpa= new Login_Page_Action(ad);
 		lpa.validate_login();
 		System.out.println("OTP page");
 		OTP_Page_Actions opa= new OTP_Page_Actions(ad);
 		opa.Validate_OTP();		
 		Selected_Vehicle_Page_Actions svpa= new Selected_Vehicle_Page_Actions(ad);
 		svpa.Vehicle_Select();
 		Dashboard_Page_Actions dpa=new Dashboard_Page_Actions(ad);
 		dpa.Handling_Dashboard_All_Popups();
 		dpa.Goodlife_icon();
 		Goodlife_Dashboard_Non_mem_Page_Actions gdnmpa=new Goodlife_Dashboard_Non_mem_Page_Actions(ad);
 		gdnmpa.Goodlife_dashboard_button();
 		Goodlife_Plans_Page_Actions gppa= new Goodlife_Plans_Page_Actions(ad);
 		gppa.click_on_view_all_benefits();
 		Goodlife_Select_Your_Plan_Page_Action gsyppa = new Goodlife_Select_Your_Plan_Page_Action(ad);
 		gsyppa.Selecting_Plan();
 		Goodlife_Profile_Details_Form_199_Page_Action gpdf_199_pa = new Goodlife_Profile_Details_Form_199_Page_Action(ad);
 		gpdf_199_pa.Profile_form_199_checkboxes_and_tap_pay_199_button();
 		
 		
}
	
		
}
	
	
	


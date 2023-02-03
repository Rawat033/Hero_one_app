package com.oneapp.test_layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page_Test {
	
static WebElement element;
	
	public static void Valid_Login(WebDriver driver) throws InterruptedException
	{
	Thread.sleep(10000);
	com.oneapp.object_repo.Login_Page.USER_ID(driver).sendKeys("10375V20");
	com.oneapp.object_repo.Login_Page.Password(driver).sendKeys("HMCL#456");
	Thread.sleep(10000);
	com.oneapp.object_repo.Login_Page.Login_btn(driver).click();
	}

}

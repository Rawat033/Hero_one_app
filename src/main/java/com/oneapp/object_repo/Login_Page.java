package com.oneapp.object_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	
	static WebDriver driver;
	public static WebElement USER_ID(WebDriver driver)
	{
	 WebElement User_Id = driver.findElement(By.xpath("//input[@name='SWEUserName']"));
	return User_Id;
	
	}
	public static WebElement Password(WebDriver driver)
	{
		WebElement Password=driver.findElement(By.xpath("//input[@name='SWEPassword']"));
		return Password;
	}
	
	public static WebElement Login_btn(WebDriver driver)
	{
		WebElement Login_btn=driver.findElement(By.xpath("//a[@id='s_swepi_22']"));
		return Login_btn;
	}
	
}

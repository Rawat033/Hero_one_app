package com.oneapp.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Webdriver {
	
	
	private static String RTDataPortal_Url="https://202.56.244.135/siebel/app/edealer/enu?SWECmd=Start&SWEHo=202.56.244.135"; 
	public static void launch_Browser(WebDriver driver)
	{
	
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		driver= new ChromeDriver();
		
		driver.navigate().to(RTDataPortal_Url);
		
		

	}

}



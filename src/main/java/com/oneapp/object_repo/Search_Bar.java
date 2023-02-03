package com.oneapp.object_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Search_Bar {
	
	static WebDriver driver;
	public static void find(WebDriver driver)
	{
	WebElement Drop_Down=driver.findElement(By.xpath("//Select[@id='findcombobox']"));
	Drop_Down.click();
	Select Sel= new Select(Drop_Down);
	Sel.selectByValue("Service Request");
	WebElement Service_Request=driver.findElement(By.xpath("//input[@id='field_textbox_2']"));
	Service_Request.sendKeys("10375-03-RSRB-0123-43182");
	Service_Request.sendKeys(Keys.ENTER);
	}

}

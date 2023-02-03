package com.oneapp.object_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Menu_Bar {
	
static WebDriver driver;
	
	public static void Service(WebDriver driver) throws InterruptedException
	{
		WebElement Drop_Down= driver.findElement(By.xpath("//select[@id='j_s_sctrl_tabScreen']"));
		Drop_Down.click();
		Thread.sleep(10000);
		com.oneapp.basic.Generic.page_Scroll(driver);
		Thread.sleep(10000);
		
		Select sel= new Select(Drop_Down);
		sel.selectByValue("tabScreen37");
		
	}

}

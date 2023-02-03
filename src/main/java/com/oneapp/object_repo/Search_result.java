package com.oneapp.object_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search_result {
	
	static WebDriver driver;
	public static void Siebel_Find(WebDriver driver) throws InterruptedException
	{
	WebElement Drop_Down=driver.findElement(By.xpath("//a[@class='drilldown' and @name='Title']"));
	Drop_Down.click();
	Thread.sleep(10000);
	WebElement SR= driver.findElement(By.xpath("//a[@class='drilldown' and @name='SR Number']"));
	SR.click();
	Thread.sleep(5000);
	WebElement Close= driver.findElement(By.xpath("//button[@class='siebui-ctrl-btn appletButton siebui-icon-hide s_1000_1_1_0 siebui-search-pane-applet-close']"));
	Close.click();
	}

}

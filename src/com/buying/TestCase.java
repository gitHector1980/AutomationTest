package com.buying;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase 
{	//this class will store all the locators & methods
	WebDriver driver;
	
	By checkoutLocator = By.xpath("//*[@id='header_logo']/a/img");
	// create the constructor for web driver
	public TestCase(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement typecheckoutLocator()
	{
		return driver.findElement(checkoutLocator);
	}
}
	
package com.testingBuy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.buying.TestCase;

public class TestingBuyPage 
{
	@Test
	public void TestingBuyPage()
	{
		//Set up Properties
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HECTOR\\Downloads\\chromedriver.exe");
		//initialize WebDriver
		WebDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//get URL
		driver.get("http://automationpractice.com");
		//create an implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		//create an object to invoke the assert method
		TestCase login = new TestCase(driver);
		// soft assert
		WebElement mystr = driver.findElement(By.xpath("//*[@id='header_logo']/a/img"));
		System.out.println(mystr.isDisplayed()+"Element logo is there");
		Assert.assertTrue(mystr.isDisplayed());
		System.out.println("Assertion passed");
	}
}

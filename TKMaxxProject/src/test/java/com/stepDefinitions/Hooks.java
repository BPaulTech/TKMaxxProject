package com.stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest{
	
	private static By COOKIES= By.cssSelector("#onetrust-accept-btn-handler");
	
	@Before
	public void start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Chromedriver4\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.tkmaxx.com/uk/en/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(COOKIES).click();
	}
	
	  @After
	    public void close() throws InterruptedException {
	    	Thread.sleep(3000);
	    	driver.close();
	    }

}

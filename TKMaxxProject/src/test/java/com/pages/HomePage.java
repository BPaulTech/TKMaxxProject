package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.runner.BaseTest;

public class HomePage extends BaseTest {
	
	public void verifyHomePage() {
	Assert.assertEquals("https://www.tkmaxx.com/uk/en/", driver.getCurrentUrl());
	System.out.println(driver.getCurrentUrl());
	}
	
	    public void searchWithValidData () throws InterruptedException {
		driver.findElement(By.cssSelector("#js-site-search-input")).click();
		driver.findElement(By.cssSelector("#js-site-search-input")).clear();
		driver.findElement(By.cssSelector("#js-site-search-input")).sendKeys("Kids's clothing");
		driver.findElement(By.cssSelector(".icon.icon-search")).click();
		Thread.sleep(2000);
	    }
	    
		public void searchWithInvalidData () throws InterruptedException {
		
    	driver.findElement(By.cssSelector("#js-site-search-input")).click();
		driver.findElement(By.cssSelector("#js-site-search-input")).clear();
		driver.findElement(By.cssSelector("#js-site-search-input")).sendKeys("JAVA");
		driver.findElement(By.cssSelector(".icon.icon-search")).click();
		Thread.sleep(2000);
		}
    
		public void clickOnSignInRegisterButton () {
		driver.findElement(By.xpath("//*[@id=\"dtAccountMenuContainer\"]/span/a[1]")).click();
			
	}
		public void searchWithValidProductForChkOut () throws InterruptedException {
			
			driver.findElement(By.cssSelector("#js-site-search-input")).click();
			driver.findElement(By.cssSelector("#js-site-search-input")).clear();
			driver.findElement(By.cssSelector("#js-site-search-input")).sendKeys("Fragrance");
			driver.findElement(By.cssSelector(".icon.icon-search")).click();
			Thread.sleep(3000);
			JavascriptExecutor executer = (JavascriptExecutor) driver;
		    executer.executeScript("window.scrollBy(0,500)");
		    Thread.sleep(2000);
			}
		
		public void clickOnStoreLocator () {
		
			driver.findElement(By.cssSelector("a[aria-label='Store Locator']")).click();
}
}
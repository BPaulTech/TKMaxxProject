package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseTest;

public class StoreLocatorPage extends BaseTest {
	
	   public void enterValidPostcode () {
			driver.findElement(By.cssSelector("#storelocator-query")).clear();
			driver.findElement(By.cssSelector("#storelocator-query")).sendKeys("SL1 1AA");
		    }
	   
	   public void enterInValidPostcode () {
			driver.findElement(By.cssSelector("#storelocator-query")).clear();
			driver.findElement(By.cssSelector("#storelocator-query")).sendKeys("$$");
			    }
	   public void clickStoreSearchButton () {
		   driver.findElement(By.cssSelector(".input-group-btn")).click();
			    }
	   public void storesValidPostcode () {
		Assert.assertEquals("https://www.tkmaxx.com/uk/en/store-finder", driver.getCurrentUrl());
			    }
	   public void errorMessageInvalidPostcode () {
		String actual=driver.findElement(By.cssSelector(".container.error.storefinder-error.no-result.error-map")).getText();
		Assert.assertTrue(actual.contains("Sorry, no stores found within 20 miles of"));
			    }
}

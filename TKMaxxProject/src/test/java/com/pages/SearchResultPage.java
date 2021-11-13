package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseTest;

public class SearchResultPage extends BaseTest{
	
	public void verifysearchWithValidData () {
		String actual=driver.findElement(By.cssSelector(".c-hero__content-title.banner--success--message")).getText();
		Assert.assertTrue(actual.contains("Kids's clothing"));

}
	public void verifysearchWithInValidData () {
		String actual=driver.findElement(By.cssSelector(".c-hero__content-title.banner--failure")).getText();
		Assert.assertTrue(actual.contains("Nothing matches"));

}
}
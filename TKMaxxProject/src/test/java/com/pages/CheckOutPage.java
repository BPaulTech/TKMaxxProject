package com.pages;

import org.junit.Assert;
import com.runner.BaseTest;

public class CheckOutPage extends BaseTest {
	
    public void verifyCheckOutPage () 
    {
    	Assert.assertEquals("https://www.tkmaxx.com/uk/en/login/checkout", driver.getCurrentUrl());
    }
}

package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.runner.BaseTest;

public class RegisterSignInPage extends BaseTest {
	
    public void fillRegisterInformations () throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"gigya-login-form\"]/div[1]/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='gigya-loginID-23701359114196720']")).clear();
		driver.findElement(By.cssSelector("input[id='gigya-loginID-23701359114196720']")).sendKeys("tkmaxx@gmail.com");
		driver.findElements(By.xpath("//div[contains(text(),'Please select')]")).get(0).click();
		driver.findElement(By.xpath("//div[contains(text(),'Mrs.')]")).click();;
		driver.findElement(By.cssSelector("#gigya-textbox-137827458032711900")).clear();
		driver.findElement(By.cssSelector("#gigya-textbox-137827458032711900")).sendKeys("Abdul");
		driver.findElement(By.cssSelector("#gigya-textbox-20504965364050530")).clear();
		driver.findElement(By.cssSelector("#gigya-textbox-20504965364050530")).sendKeys("Kalam");
		driver.findElement(By.cssSelector("#gigya-textbox-67870012272381180")).clear();
		driver.findElement(By.cssSelector("#gigya-textbox-67870012272381180")).sendKeys("0740222255");
		driver.findElement(By.cssSelector("#gigya-password-125987489225472450")).clear();
		driver.findElement(By.cssSelector("#gigya-password-125987489225472450")).sendKeys("Automation2021");
		driver.findElement(By.cssSelector("#gigya-password-135131409307225010")).clear();
		driver.findElement(By.cssSelector("#gigya-password-135131409307225010")).sendKeys("Automation2021");
		driver.findElement(By.cssSelector("label[for='gigya-checkbox-54104590422484160']")).click();
		driver.findElement(By.cssSelector("label[for='gigya-checkbox-90941920745941800']")).click();
		
		JavascriptExecutor executer = (JavascriptExecutor) driver;
	    executer.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(3000);
	    
		driver.findElement(By.cssSelector("label[for='gigya-checkbox-77891791065100370']")).click();
		driver.findElement(By.cssSelector("label[for='gigya-checkbox-9315000638132092']")).click();
		driver.findElement(By.cssSelector("label[for='gigya-checkbox-57818566102143110']")).click();
		executer.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.cssSelector("#treasure-alert-text")).click();
		
    }
    
    public void clickRegisterButton () {
        driver.findElement(By.xpath("//*[@id=\"gigya-register-form\"]/div[1]/div[19]/input")).click();
    
}
    
    public void verifyRegistration () {
        Assert.assertEquals("https://www.tkmaxx.com/uk/en/login", driver.getCurrentUrl());
}
    public void clickSignInButton () {
    	driver.findElement(By.xpath("//*[@id=\"gigya-login-form\"]/div[1]/div[4]/input")).click();
    
}
    public void fillValidSignInformations () {
    	driver.findElement(By.cssSelector("input[data-display-name='email address']")).clear();
    	driver.findElement(By.cssSelector("input[data-display-name='email address']")).sendKeys("xyz@gmail.com");
    	driver.findElement(By.cssSelector("#gigya-password-142605735054550000")).clear();
    	driver.findElement(By.cssSelector("#gigya-password-142605735054550000")).sendKeys("Tkmaxx123");
    }
    public void fillInValidSignInformations () {
    	driver.findElement(By.cssSelector("input[data-display-name='email address']")).clear();
    	driver.findElement(By.cssSelector("input[data-display-name='email address']")).sendKeys("Mylogin.details");
    	driver.findElement(By.cssSelector("#gigya-password-142605735054550000")).clear();
    	driver.findElement(By.cssSelector("#gigya-password-142605735054550000")).sendKeys("12345");
    	
    }
    public void verifySignedIn () {
        Assert.assertEquals("https://www.tkmaxx.com/uk/en/login", driver.getCurrentUrl());
        }
    
    public void verifySignInErrorMessage () {
    	String actual=driver.findElement(By.cssSelector(".gigya-error-msg.gigya-form-error-msg.gigya-error-code-403042.gigya-error-msg-active")).getText();
    	Assert.assertTrue(actual.contains("Oops! You've entered incorrect details. Please check and try again."));
    	}
    
}

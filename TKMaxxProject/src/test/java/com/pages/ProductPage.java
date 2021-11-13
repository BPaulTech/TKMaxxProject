package com.pages;

import org.openqa.selenium.By;

import com.runner.BaseTest;

public class ProductPage extends BaseTest {
	
    public void selectPrdctQntyForCkOut () throws InterruptedException {
    	driver.findElement(By.cssSelector(".c-product-grid__item.lovelist-product-item.lovelist_42816039")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.cssSelector(".button")).click();
    	driver.findElement(By.cssSelector("li[data-index='0']")).click();
	    }
    public void addItemToBsktForCkOut () throws InterruptedException {
    	driver.findElement(By.cssSelector("#addToCartButton")).click();
    	}
    
    public void itemAddedToShoppingBag () throws InterruptedException {
    	driver.findElement(By.cssSelector(".js-mini-cart-link.header-cart-link-element")).click();
    	Thread.sleep(2000);
	    }
    public void clickCheckoutButton () throws InterruptedException {
    	driver.findElements(By.cssSelector(".btn.btn-lg.c-btn.c-btn--primary.basket-button.iconBtn.o-default-h4")).get(0).click();
	    }
    
    

}

/**
 * 
 */
package com.letskodeit.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Bitra
 *
 */
public class addToCart {
	WebDriver driver;
	By womenLink = By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]");
	By WomenTitle = By.xpath("//h2[@class='title_block']");
	By hoverOnImage1 = By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//img[@class='replace-2x img-responsive']");
	By clickOnAddToCart = By.xpath("//button[@type='submit']");
	
	public addToCart(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnWomenLink() {
		try {
			System.out.println (" Clicking on womens Link");
			driver.findElement(womenLink).click();
			Thread.sleep(5000);
			System.out.println (" Women Link got clicked");
			
		}
		catch ( Exception e) {
			System.out.println (" Link not found " +e.getMessage());
			
		}
	}
	
	public boolean verifyWomenLink(){
		try {
			System.out.println("Verifying Womens Link");
			return driver.findElement(WomenTitle).getText().contentEquals("Women");
			
		}catch ( Exception e) {
			System.out.println (" The Title Does not match " +e.getMessage());
			return false;
			
		}
	
	}
	public void hoverOnImage() {
		try {
			System.out.println("hoveron A Image");
			pageScrolldown();
			Actions act = new Actions(driver);
			WebElement element = driver.findElement(hoverOnImage1);
			act.moveToElement(element).click().build().perform();
			System.out.println("element got hoverd");
		
	}catch ( Exception e) {
		System.out.println (" hover element not found " +e.getMessage());
		
		
	}
  }
	public void pageScrolldown() {
		try {
			System.out.println(" pageScrollDown");
			JavascriptExecutor js = (JavascriptExecutor) driver;  
			   js.executeScript("window.scrollBy(0,1000)");
			
		}catch ( Exception e) {
			System.out.println (" Didnt scroll down " +e.getMessage());
			
			
		}
	}
	public void addtoCart() {
		try {
			System.out.println(" adding element to  add to cart");
			driver.findElement(clickOnAddToCart).click();
		}catch ( Exception e) {
			System.out.println (" not able to click on add to cart " +e.getMessage());
			
			
		}
	}

}

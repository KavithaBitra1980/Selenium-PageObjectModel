/**
 * 
 */
package com.letKodeit.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.letskodeit.Pages.addToCart;


/**
 * @author Bitra
 * This test to add to cart
 *
 */
public class verifyWomenLink {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://automationpractice.com/index.php";
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		addToCart ap = new addToCart(driver);
		ap.clickOnWomenLink();
		ap.verifyWomenLink();
		ap.hoverOnImage();
		ap.addtoCart();
		
		
	}

}

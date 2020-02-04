/**
 * 
 */
package com.letskodeit.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Kavitha Bitra
 * This class will store all locators and methods of Login Page
 */
public class LoginPage {
	
	WebDriver driver;

	By  loginLink = By.linkText("Login");
	By EmailAddress = By.xpath("//input[@id='user_email']");
	By passWord = By.id("user_password");
	By loginButton = By.name("commit");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public boolean verifyUserLogin() {
		try {
			System.out.println(" The user is trying to Login");
			driver.findElement(loginLink).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(EmailAddress).click();
			driver.findElement(EmailAddress).sendKeys("kavithabitravirginia@gmail.com");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(passWord).sendKeys("testabc");
			driver.findElement(loginButton).click();
			System.out.println("Successfully login");
			return true;
	}catch ( Exception e) {
		System.out.println (" The user is not able to login " +e.getMessage());
		return false;
	}
  }
	
}

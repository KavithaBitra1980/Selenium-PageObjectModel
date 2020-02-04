/**
 * 
 */
package com.letskodeit.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Bitra
 * This page is for Practice page for the test Website.
 * The page contains all objects related to practice page
 *
 */
public class practicePage {
	
	WebDriver driver;
	By practiceLink = By.xpath("//a[@class='fedora-navbar-link navbar-link']");
	By pageTitle = By.xpath("//h1[contains(text(),'Practice Page')]");
	
	BasePage bp = new BasePage();
	
	public boolean verifyPageTitle() {
		try {
			
			System.out.println("Verifying page title for Practice Page");
			return driver.findElement(pageTitle).getText().equals("Practice Page");
		}catch ( Exception e) {
			System.out.println (" The Title Does not match " +e.getMessage());
			return false;
		}
	}
	
	public void clickOnPracticeLink() {
		try {
			
			System.out.println("Clicking on Practice link");
			 driver.findElement(practiceLink).click();
			 Thread.sleep(15000);
			 System.out.println("Link got clicked successfully");
			 Thread.sleep(15000);
			
		}catch ( Exception e) {
			System.out.println (" The Link not found " +e.getMessage());
			
		}
	}

}

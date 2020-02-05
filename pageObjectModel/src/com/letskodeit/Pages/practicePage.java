/**
 * 
 */
package com.letskodeit.Pages;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Bitra
 * This page is for Practice page for the test Website.
 * The page contains all objects related to practice page
 *
 */
public class practicePage {
	
	static WebDriver driver;
	By practiceLink = By.xpath("//a[@class='fedora-navbar-link navbar-link']");
	By pageTitle = By.xpath("//h1[contains(text(),'Practice Page')]");
	//By BMWRadioButton = By.xpath("//div[@id='radio-btn-example']//label[1]");
	By BMWRadioButton = By.xpath("//input[@id='bmwradio']");
	static By dropDown = By.xpath("//select[@id='carselect']");
	By hondaCheckBox = By.xpath("//input[@id='hondacheck']");
	
	public  practicePage(WebDriver driver) {
		this.driver = driver;
		
	}
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
	/**
	 * 
	 * @param carModel
	 * Method to select any carmodel
	 */
	public void selectBMWRadioButton() {
		try {
			System.out.println (" Selecting BMW options from the options");
			String carModelText = driver.findElement(BMWRadioButton).getText();
			driver.findElement(BMWRadioButton).click();
			Thread.sleep(3000);
			System.out.println(carModelText);
		}catch ( Exception e) {
			System.out.println (" The carModel Link not found " +e.getMessage());
		}
			
	}
	public void selectBenzFromDrpDwn() {
		try {
			System.out.println (" Selecting benz from Drop down");
			Select drpdn = new Select(driver.findElement(dropDown));
			drpdn.selectByVisibleText("Benz");
			System.out.println("Benz got selected");
			
		}catch ( Exception e) {
			System.out.println (" The carModel drop down not found " +e.getMessage());
		}
	}
	
	public void selectHondaCheckbox() {
		try {
			System.out.println(" Select Honda Option");
			driver.findElement(hondaCheckBox).click();
			System.out.println(" Honda got clicked");		
		}catch ( Exception e) {
			System.out.println (" The Honda not found " +e.getMessage());
		}
	}
}

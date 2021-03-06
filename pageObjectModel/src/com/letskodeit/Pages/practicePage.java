/**
 * 
 */
package com.letskodeit.Pages;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	WebDriver driver;
	By practiceLink = By.xpath("//a[@class='fedora-navbar-link navbar-link']");
	By pageTitle = By.xpath("//h1[contains(text(),'Practice Page')]");
	//By BMWRadioButton = By.xpath("//div[@id='radio-btn-example']//label[1]");
	By BMWRadioButton = By.xpath("//input[@id='bmwradio']");
	static By dropDown = By.xpath("//select[@id='carselect']");
	By hondaCheckBox = By.xpath("//input[@id='hondacheck']");
	By openWindowButton = By.xpath("//button[@id='openwindow']");
	By openNewTab = By.xpath("//a[@id='opentab']");
	By searchCourse = By.xpath("//input[@id='search-courses']");
	By searchBUtton = By.xpath("//button[@id='search-course-button']");
	By sendNameKeytoAlert = By.xpath("//input[@id='name']");
	By alertButton = By.xpath("//input[@id='alertbtn']");
	
	public  practicePage(WebDriver driver) {
		this.driver = driver;
		
	}
	//method to verify a title
	public boolean verifyPageTitle() {
		try {
			
			System.out.println("Verifying page title for Practice Page");
			return driver.findElement(pageTitle).getText().equals("Practice Page");
		}catch ( Exception e) {
			System.out.println (" The Title Does not match " +e.getMessage());
			return false;
		}
	}
	
	//method to click on a link
	
	public void clickOnPracticeLink() {
		try {
			
			System.out.println("Clicking on Practice link");
			 driver.findElement(practiceLink).click();
			 Thread.sleep(3000);
			 System.out.println("Link got clicked successfully");
			 Thread.sleep(3000);
			
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
	//Method for selecting from drop down
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
	//method for clicking on check boxed
	public void selectHondaCheckbox() {
		try {
			System.out.println(" Select Honda Option");
			driver.findElement(hondaCheckBox).click();
			System.out.println(" Honda got clicked");		
		}catch ( Exception e) {
			System.out.println (" The Honda not found " +e.getMessage());
		}
	}
	//method to switch to new window
	public void switchtoNewWindow() {
		try {
			System.out.println(" Switching to new window");
			String parentWindow = driver.getWindowHandle();
			driver.findElement(openWindowButton).click();
			Set<String> windowHandle = driver.getWindowHandles();
			for (String handle:windowHandle ) {
				if (handle.equals(handle)) {
				 driver.switchTo().window(handle);
				 Thread.sleep(3000);
				 System.out.println(" Title of the new window" + driver.getTitle());
				 clickOnPracticeLink();
				 Thread.sleep(3000);
				 System.out.println("Closing the new window");
				 driver.close();
			}	
		}
			driver.switchTo().window(parentWindow);
			System.out.println(" Parent Windows is" + driver.getCurrentUrl());
	}catch ( Exception e) {
		System.out.println (" The window element not found " +e.getMessage());
	}
  }
	//method to switch to  new tab
	public void switchToNewTab() {
		try {
			System.out.println("Switching to new tab");
			driver.findElement(openNewTab).click();
			
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(3000);
			driver.findElement(searchCourse).sendKeys("Python");
			driver.findElement(searchBUtton).click();
			
			driver.close();
			driver.switchTo().window(tabs.get(0));
		}catch ( Exception e) {
			System.out.println (" The tab element not found " +e.getMessage());
		}
	}
	
	// method for Scrolling a window
	public void scrollWindow() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,100)");
		}catch ( Exception e) {
			System.out.println (" The javascript didnt work " +e.getMessage());
		}
	}
	//method for Switch to an alert and accept the alert
	public void switchToAlert() {
		try {
			System.out.println("Switching to alerts");
			scrollWindow();
			driver.findElement(sendNameKeytoAlert).sendKeys("testname");
			
			driver.findElement(alertButton).click();
			driver.switchTo().alert().accept();
		}catch ( Exception e) {
			System.out.println (" The tab element not found " +e.getMessage());
		}
	}
}

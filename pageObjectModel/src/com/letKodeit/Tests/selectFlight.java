/**
 * 
 */
package com.letKodeit.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.letskodeit.Pages.expediaPage;

/**
 * @author Bitra
 * This test for Selecting Flights page
 *
 */
public class selectFlight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.expedia.com/";
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		expediaPage ep = new expediaPage(driver);
		ep.clickOnFlightsLink();
		ep.getAllElements();
		ep.flyingFrom();
		ep.flyingTo();
		ep.departingDateselection();
		ep.returningDateselection();
		ep.selectTravellers();
		ep.clickOnSearchButton();
		
	
	}

}

package com.letKodeit.Tests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.letskodeit.Pages.BasePage;
import com.letskodeit.Pages.LoginPage;

public class userLoginAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			WebDriver driver = new FirefoxDriver();
			String baseURL = "https://learn.letskodeit.com/";
			driver.get(baseURL);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		   /**
		    * Verifying login access
		    */
		  
		   LoginPage login = new LoginPage(driver);
		   login.verifyUserLogin();
		   
		
		}	
	
	
}

package com.appdirect.checkerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.appdirect.UtilsPackage.UtilClass;

import junit.framework.Assert;

public class HomepageChecker {
	WebDriver driver;
	UtilClass util =new UtilClass();
	
	public HomepageChecker(WebDriver driver) {
		this.driver =driver;
	}

	public HomepageChecker checkHomepage(WebDriver driver){
		    String title  = driver.getTitle();
	        Assert.assertEquals(title, "AppDirect");
	        Reporter.log("AppDirect HomePage",true);  
		return new HomepageChecker(driver);
		
	}
	
	public HomepageChecker checkLoginButton(WebDriver driver) {
	boolean status = driver.findElement(By.xpath(UtilClass.getLoginButtonPath)).isDisplayed();
	if(status==true) 
	{
		Assert.assertTrue("Login button Exist", status);
		Reporter.log("Login Button Exist",true); 
		}    	            
	else
	{
		Assert.assertTrue("Login button doesn't Exist", status);
		Reporter.log("Login Button Doesnt exist",true);
		}
	return new HomepageChecker(driver);
	}

}

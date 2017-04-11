package com.appdirect.checkerPackage;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.appdirect.ExceptionPackage.IOException;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.UtilClass;

import junit.framework.Assert;

public class LoginpageChecker {
	WebDriver driver;
	UtilClass util =new UtilClass();
	WaitClass wait1 =new WaitClass();
		
	public LoginpageChecker(WebDriver driver) {
		this.driver =driver;
	}
	
	public LoginpageChecker checkLoginpage(WebDriver driver){ 
		    String currentUrl  = driver.getCurrentUrl();
		   Assert.assertEquals(currentUrl, "https://www.appdirect.com/");	
		   Reporter.log("AppDirect LoginPage",true);
			return new LoginpageChecker(driver);		
	}

	public LoginpageChecker checkSignupButton(WebDriver driver) throws TimeoutException, IOException {
		try{
		wait1.waitCalling1(driver);
		boolean status = (driver.findElement(By.xpath(UtilClass.getGetSignupButtonPath))).isDisplayed();
		if(status==true)
		{
			Assert.assertTrue("Sign Up button Exist", status);
			Reporter.log("Sign Up Button Exist",true); 
			}    	            
		else
		{
			Assert.assertTrue("Sign Up button doesn't Exist", status);
			Reporter.log("Sign Up  Button Doesnt exist",true);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return new LoginpageChecker(driver);
	}


}

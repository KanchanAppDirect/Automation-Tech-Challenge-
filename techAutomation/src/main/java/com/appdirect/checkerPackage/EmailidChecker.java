package com.appdirect.checkerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.appdirect.UtilsPackage.UtilClass;

import junit.framework.Assert;

public class EmailidChecker {
	WebDriver driver;
	
	public EmailidChecker(WebDriver driver) {
	   this.driver= driver;
	}

	public EmailidChecker checkemailId(WebDriver driver){
		boolean status = driver.findElement(By.xpath(UtilClass.EmailPath)).isDisplayed();
		if(status==true){
				Assert.assertTrue("Email Path Confirm", status);
				Reporter.log("Email Path Confirm",true); 
				}    	            
			else
			{
				Assert.assertTrue("Email Path not Confirm", status);
				Reporter.log("Email Path not Confirm",true);
				}	
		return new  EmailidChecker(driver);
	}

}

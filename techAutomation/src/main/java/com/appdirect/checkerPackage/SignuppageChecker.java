package com.appdirect.checkerPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.appdirect.Pages.SignUppage;
import com.appdirect.UtilsPackage.UtilClass;

import junit.framework.Assert;

public class SignuppageChecker {
	WebDriver driver;
	UtilClass util =new UtilClass();
	
	public SignuppageChecker(WebDriver driver) {
		this.driver =driver;
	}

	public SignUppage checkSignuPage(WebDriver driver) throws IOException{	
		    String title  = driver.getTitle();
	        Assert.assertEquals(title, "Sign Up for AppDirect");
	        Reporter.log("AppDirect SignUp Page",true);
			return new SignUppage(driver);  
}

 } 

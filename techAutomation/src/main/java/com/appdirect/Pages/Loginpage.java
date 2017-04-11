package com.appdirect.Pages;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.UtilClass;
import com.appdirect.checkerPackage.LoginpageChecker;

public class Loginpage {
		WebDriver driver;
		WaitClass wait1 =new WaitClass();
		UtilClass util =new UtilClass();
		LoginpageChecker checker;

	public Loginpage (WebDriver driver) throws IOException {
		try {
	    util.loginpageUtil();
		this.driver= driver;
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Loginpage verifyLoginpage(WebDriver driver) throws IOException, TimeoutException {
		LoginpageChecker checker = PageFactory.initElements(driver, LoginpageChecker.class);
		try {
			checker
			.checkLoginpage(driver)
			.checkSignupButton(driver);
		} catch (com.appdirect.ExceptionPackage.IOException e) {
			
			e.printStackTrace();
		}
		return new Loginpage(driver);
	}
	
	public Loginpage clickOnSignupButton(WebDriver driver) throws  IOException{
		try{  
		  driver.findElement(By.xpath(UtilClass.getGetSignupButtonPath)).click();
		  wait1.waitCalling1(driver);
		   }
		catch(Exception e){
			e.printStackTrace();
		}
		  return new Loginpage(driver); 
		
	}

}

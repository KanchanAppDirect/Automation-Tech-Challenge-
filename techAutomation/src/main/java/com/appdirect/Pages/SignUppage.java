package com.appdirect.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.UtilClass;
import com.appdirect.checkerPackage.EmailidChecker;
import com.appdirect.checkerPackage.SignuppageChecker;


public class SignUppage {
	WebDriver driver;
	WaitClass wait1 =new WaitClass();
	UtilClass util =new UtilClass();

	public SignUppage(WebDriver driver) throws IOException{
	try{
		this.driver= driver;
		util.signuppageUtil();
		
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
	

	public SignUppage verifySignuppage(WebDriver driver) throws NullPointerException, IOException{
		try{
		SignuppageChecker checker = new SignuppageChecker(driver);
		checker.checkSignuPage(driver); 
		}
		catch(NullPointerException e) {
			throw new NullPointerException("Title path not found");
		}
		return new SignUppage(driver);
			 
	}
	
	public SignUppage verifyEmailpath(WebDriver driver) throws NullPointerException, IOException{
		try{
			EmailidChecker echecker =new EmailidChecker(driver);
			echecker.checkemailId(driver);
		}
		catch(NullPointerException e){
			throw new NullPointerException("Email path not found");
		}
		return new SignUppage(driver);
	}
	
	
	public SignUppage signUpMethod(WebDriver driver) throws  IOException {
		WebElement element =driver.findElement(By.xpath(UtilClass.EmailPath));
		     element.sendKeys(UtilClass.EmailId);
		     try {
				wait1.waitCalling3(driver);
			} 
		     catch (com.appdirect.ExceptionPackage.IOException e) {
				e.printStackTrace();
			}
		     driver.findElement(By.xpath(UtilClass.getSignUpPath)).click(); 
		     try {
				wait1.waitCalling2(driver);
			} 
		     catch (com.appdirect.ExceptionPackage.IOException e) {
				e.printStackTrace();
			} 
		     return new SignUppage(driver);
}
	




}

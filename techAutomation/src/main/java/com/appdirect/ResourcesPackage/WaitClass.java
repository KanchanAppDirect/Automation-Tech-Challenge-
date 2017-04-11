package com.appdirect.ResourcesPackage;


import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appdirect.ExceptionPackage.IOException;
import com.appdirect.UtilsPackage.UtilClass;

public class WaitClass {
	WebDriverWait wait;
	WebDriver driver;
	public void waitCalling(WebDriver driver) throws IOException
	{
		 wait = new WebDriverWait(driver,10);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UtilClass.getLoginButtonPath)));
	}

	public void waitCalling1(WebDriver driver) throws TimeoutException
	{
		 wait = new WebDriverWait(driver,10);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UtilClass.getGetSignupButtonPath)));
	}
	
	public void waitCalling2(WebDriver driver) throws IOException
	{
		 wait = new WebDriverWait(driver,10);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UtilClass.getSignUpPath)));
	}
	public void waitCalling3(WebDriver driver) throws IOException
	{
		 wait = new WebDriverWait(driver,10);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UtilClass.EmailPath)));
	}
}


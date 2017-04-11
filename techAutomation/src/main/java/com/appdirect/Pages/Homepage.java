
package com.appdirect.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.UtilClass;
import com.appdirect.checkerPackage.HomepageChecker;



/**
 * @author kanchan.sharma
 * Appdirect Home page
 */
public class Homepage {
	WebDriver driver;
	WaitClass wait =new WaitClass();
	UtilClass util =new UtilClass();

	
	public Homepage(WebDriver driver) throws IOException{
	 this.driver= driver;
	  util.homepageUtil(); 	
	}
		
    public Homepage pagename(WebDriver driver) throws IOException {
    	driver.get(UtilClass.pagename);	
		return new Homepage(driver);
    }
    
  
    public Homepage verifyHomepage(WebDriver driver) throws NoSuchElementException, IOException{
    	HomepageChecker checker = new HomepageChecker(driver);
        checker
        .checkHomepage(driver)
        .checkLoginButton(driver);   
    	return new Homepage(driver);
      }
    
    
	 public Homepage clickOnLoginButton(WebDriver driver) throws IOException {  		
	        try {
	            driver.findElement(By.xpath(UtilClass.getLoginButtonPath)).click();
				wait.waitCalling(driver);
			} 
	        catch (com.appdirect.ExceptionPackage.IOException e) {
				
				e.printStackTrace();
			} 
	        return new Homepage(driver);
	}
	
}

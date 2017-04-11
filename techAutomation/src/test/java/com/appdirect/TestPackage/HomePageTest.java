package com.appdirect.TestPackage;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.Pages.Homepage;
import com.appdirect.Pages.Loginpage;
import com.appdirect.Pages.SignUppage;
import com.appdirect.ResourcesPackage.BrowserSetup;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.UtilClass;


public class HomePageTest {
	UtilClass util =new UtilClass();
	WaitClass wait =new WaitClass();
	WebDriver driver=null;
	
	@BeforeClass
	public void setupBrowser() throws IOException{
		Reporter.log("Browsers Options :: ",true);
		Reporter.log("Firefox",true);
		Reporter.log("Chrome",true);
		Reporter.log("Safari",true);
		
		Scanner sc=new Scanner(System.in);
		String browserName=sc.next();
		
		driver = BrowserSetup.startBrowser(browserName);
		driver.manage().window().maximize(); 		
	}

	  @Test
	  public void openHomePage() throws IOException, NoSuchElementException {	
		  try{
		  Homepage home =PageFactory.initElements(driver, Homepage.class); 
		  home
		   .pagename(driver)
		   .verifyHomepage(driver)
		   .clickOnLoginButton(driver);
	    }
	    catch(IOException e){
	   	 e.printStackTrace();
	    }
		catch(NoSuchElementException e){
	    e.printStackTrace();
	    }
	  }
		
	  @Test
	  public void openLoginPage() throws IOException, TimeoutException{
		 try{
	     Loginpage  login =PageFactory.initElements(driver, Loginpage.class);
	     login
	     .verifyLoginpage(driver)
		 .clickOnSignupButton(driver);
	 }
		 catch(IOException e){
			 e.printStackTrace();
		 }
		
	  }
		  
     @Test
    	 public void opensignupPage() throws NullPointerException, com.appdirect.ExceptionPackage.IOException{
    	 try {
		  SignUppage signUp =PageFactory.initElements(driver, SignUppage.class);
		  signUp
		  .verifySignuppage(driver)
		  .verifyEmailpath(driver)
		  .signUpMethod(driver);
			  
	      }
		 catch(NullPointerException e){
			e.printStackTrace();
		}
    	 catch(IOException e){
 			e.printStackTrace();
 		}
}
     
   @AfterClass  
     public void closeDriver() throws Exception{
    	 try{
    		 driver.close();
    	 }
    	 catch(Exception e){
    		 e.printStackTrace();
    	 }
     }
	
}
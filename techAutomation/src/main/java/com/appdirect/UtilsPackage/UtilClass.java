package com.appdirect.UtilsPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;


public class UtilClass {
	
	Properties properties = new Properties();
	InputStream input = null;
	
	public static String pagename;
	public static String getLoginButtonPath;
	public static String getGetSignupButtonPath;
	public static String EmailPath;
	public static String EmailId;
	public static String getSignUpPath;
	public static String confirmPath;
    

	public void homepageUtil() throws IOException{
		try{	
			File file = new File("/Users/kanchan.sharma/Documents/workspace/techAutomation/src/main/java/com/appdirect/UtilsPackage/homepage.properties");
			input = new FileInputStream(file);
			properties.load(input);		
            pagename =properties.getProperty("pagename");
            getLoginButtonPath = properties.getProperty("loginButtonXpath");	
		  }
	     catch (IOException e) {		
			e.printStackTrace();
		}
           }
	
	public void loginpageUtil() throws IOException {
		try{
			File file = new File("/Users/kanchan.sharma/Documents/workspace/techAutomation/src/main/java/com/appdirect/UtilsPackage/loginpage.properties");
			input = new FileInputStream(file);
			properties.load(input);	
			getGetSignupButtonPath=properties.getProperty("signUpButtonXpath");	
		}
		catch(IOException e){
			e.printStackTrace();
		} 
				
	      }
	
   public void signuppageUtil() throws IOException {
	   try{
		   File file = new File("/Users/kanchan.sharma/Documents/workspace/techAutomation/src/main/java/com/appdirect/UtilsPackage/signuppage.properties");
		   input = new FileInputStream(file);
		   properties.load(input);
               EmailPath= properties.getProperty("emailXpath");
               Random rand = new Random(); 
               EmailId = rand.nextInt(200)+properties.getProperty("emailId");
               getSignUpPath= properties.getProperty("signUpId");
               confirmPath=properties.getProperty("divXpath");
	      } 
	   catch (IOException e) {
		e.printStackTrace();
	}
      }        

}

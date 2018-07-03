/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author kodali
 * This class will store all locators and methods of login page
 *
 */
public class Loginpage
{
	
	
	WebDriver driver;
	//intially driver value is null as we did not declare any value;
	By username= By.id("user_login");
	By password =By.xpath(".//*[@id='user_pass']");
	By login =By.name("wp-submit");
	
	
	public Loginpage(WebDriver localdriver)
	//chromeDriver is passed from verifywordpresslogin class
	{
	   this.driver=localdriver;
	   //this means Loginpage object, which means driver =chormedriver; here we are defining webdriver driver
	   	   
	}
	
	public void typeUserName(String uid){
		
		driver.findElement(username).sendKeys(uid);
	}
	

	
	public void typepassword(String pass){
		
		driver.findElement(password).sendKeys(pass);
	}
	
	public void loginpage(){
		
		driver.findElement(login).click();
		
	}
	
}

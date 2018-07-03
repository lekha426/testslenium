package com.wordpress.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//using findby 
//using findby how
public class LoginpageUsingFactory {

	WebDriver driver;
	
	public LoginpageUsingFactory(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	 
	@FindBy(how=How.ID, using="user_login") WebElement username;
	//@FindBy(id="user_login") WebElement username;
	
	@FindBy(how=How.XPATH, using=".//*[@id='user_pass']") WebElement password;


	@FindBy(how=How.NAME, using="wp-submit") WebElement login;
	

	
	public void login_wordpress(String uid, String pass){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		username.sendKeys(uid);
		password.sendKeys(pass);
		login.click();
	}
}
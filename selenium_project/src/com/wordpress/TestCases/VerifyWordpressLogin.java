package com.wordpress.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.Loginpage;
//using pom from loginpage.java elements we are calling that class
public class VerifyWordpressLogin {

	@Test
	public void verifyValidLogin()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		Loginpage login= new Loginpage(driver);
		login.typeUserName("admin");
		login.typepassword("demo123");
		login.loginpage();
		driver.quit();
		
	}
}

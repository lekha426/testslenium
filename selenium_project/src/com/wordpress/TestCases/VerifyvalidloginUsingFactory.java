/**
 * 
 */
package com.wordpress.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.BrowserFactory;
import com.wordpress.pages.LoginpageUsingFactory;

/**
 * @author kodali
 * used browserfactory and loginpageusingfactory for login in to the browser with page object factory
 *
 */
public class VerifyvalidloginUsingFactory {
	
	@Test
	public void checkuser(){
	WebDriver driver = BrowserFactory.StartBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
	LoginpageUsingFactory abc=PageFactory.initElements(driver, LoginpageUsingFactory.class);
    // login_page.login_wordpress("admin", "demo123");
     
     abc.login_wordpress("admin", "demo123");
	}
}

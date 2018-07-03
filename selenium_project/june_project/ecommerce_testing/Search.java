package ecommerce_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search {
	By user= By.id("ap_email");
	By password= By.id("ap_password");
	By login=By.id("signInSubmit");
	By continu= By.id("continue");
	By searchbox= By.id("twotabsearchtextbox");

	
	ChromeDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,90);
	
			@Test(priority=1)
		public void amazonsearch(){
			try {
				driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&switch_account=");
				
				Thread.sleep(5000);
				driver.findElement(searchbox).sendKeys("camera");
				WebElement searchbox1= driver.findElement(searchbox);
				searchbox1.sendKeys(Keys.RETURN);
			
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	@Test(priority=2)
public void amazonrelaventseachresults(){

		
	try 
	{
		for(int i=0; i<10; i++)
		{
			Thread.sleep(5000);
			WebElement a =driver.findElement(By.xpath("//*[@id='result_"+ i +"']/div/div[2]/div[2]/div[1]/a/h2"));
			Assert.assertTrue(a.getText().contains("camera"), "Search result validation failed at instance [ + i + ].");
			   
		  
		    String str= a.getText();
		   Assert.assertTrue(str.contains("camera"));
		   driver.navigate().back();
          // System.out.println(value1);
		}
	} catch (InterruptedException e)
	{
	
		e.printStackTrace();
		
		
	}
} 

}

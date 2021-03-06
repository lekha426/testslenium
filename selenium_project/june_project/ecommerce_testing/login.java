package ecommerce_testing;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login {
	
	By user= By.id("ap_email");
	By password= By.id("ap_password");
	By login=By.id("signInSubmit");
	By continu= By.id("continue");
	By searchbox= By.id("twotabsearchtextbox");

	
	ChromeDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,90);
	@Test
	public void invokeBrowser(){
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&switch_account=");
		entercredentials();
	}
	@Test(priority=0)
	public void entercredentials()
	{
		try { 
			Thread.sleep(5000);
			driver.findElement(user).sendKeys("hrullekhakodali@gmail.com");
			driver.findElement(continu).click();
			driver.findElement(password).sendKeys("hrullekha123!");
			driver.findElement(login).click();
			
			//amazonsearch();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	}
	
/*	@Test
	public void amazonsearch(){
		try {
			Thread.sleep(5000);
			driver.findElement(searchbox).sendKeys("camera");
			WebElement searchbox1= driver.findElement(searchbox);
			searchbox1.sendKeys(Keys.RETURN);
			//amazonrelaventseachresults();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	

	@Test(priority=1)
 public void amazonslideshow_image() {
	
		try {
			List<WebElement> ls= driver.findElements(By.cssSelector("#anonCarousel1 > ol > li"));
			for(int i=0; i<ls.size(); i++)
			{
				System.out.println("hi lekha");
				String val = ls.get(i).getAttribute("aria-hidden");
				if(val.equals("false"))
				{
					Thread.sleep(5000);
					List<WebElement> lsagain1= driver.findElements(By.cssSelector("#anonCarousel1 > ol > li"));
					String valTemp = lsagain1.get(i).getAttribute("aria-hidden");
					System.out.println(valTemp + " second "+ val + "first");
					Assert.assertNotEquals(val, valTemp);
					break;
				}
			}
		} catch (InterruptedException e) {  
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }
	
	@Test(priority=2)
	public void amazonhoveronimage(){
		driver.get("https://www.amazon.com/?ref_=nav_signin&");
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#anonCarousel1 > ol > li:nth-child(1)")));
		WebElement elem= driver.findElement(By.cssSelector("#anonCarousel1 > ol > li:nth-child(1)"));
		Actions builder = new Actions(driver);
		Action moverhoveronimage=builder.moveToElement(elem).build();
		moverhoveronimage.perform();
		System.out.println("amazonhoveronimage is working");
		//System.out.println(elem.getAttribute("aria-hidden"));
		
	}
	
	

		
	@Test(priority=1)
		public void imageclick(){
			driver.get("https://www.amazon.com/?ref_=nav_signin&");
			System.out.println("jaijai2");
			WebDriverWait wait= new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gw-ftGr-desktop-hero-piv")));
			System.out.println("jaijai");
			WebElement wb= driver.findElement(By.id("gw-ftGr-desktop-hero-piv"));
		WebElement wbchild= wb.findElement(By.className("a-link-normal"));
			String valTemp = wbchild.getAttribute("href");
			System.out.println(valTemp);
			if(valTemp.length()>1){
				System.out.println(valTemp + "is success");
			}
		}
}

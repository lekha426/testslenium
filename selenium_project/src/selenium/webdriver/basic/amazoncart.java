package selenium.webdriver.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazoncart {

	
	WebDriver driver;

	
	public void invokeBrowser2()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kodali\\Downloads\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&switch_account=");
			Thread.sleep(5000);
			searchCourse2();
		} catch (Exception e)
		{
						e.printStackTrace();
		}
	}
	
	public void searchCourse2(){
		
		try {
			driver.findElement(By.id("ap_email")).click();
			driver.findElement(By.id("ap_email")).clear();
			driver.findElement(By.id("ap_email")).sendKeys("hrullekhakodali@gmail.com");			
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("Hrullekha123!");
			driver.findElement(By.id("signInSubmit")).click();		
			driver.findElement(By.className("nav-input")).click();			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earrings");
			driver.findElement(By.className("nav-input")).click();
			
			driver.findElement(By.xpath("//*[@id='leftNav']/ul[2]/ul/li/span/ul/div/li[2]/span/ul/div/li[2]/span/ul/div/li[2]/span/a/span")).click();
			
			for(int i=0; i<=20; i++){
				driver.findElement(By.id("result_"+i)).click();	
				driver.findElement(By.id("add-to-cart-button")).click();	
				driver.navigate().back();
				driver.navigate().back();
				
			}
			driver.findElement(By.id("nav-cart")).click();
			
	
			for(int i=0; i<=20;i++){
			driver.findElement(By.xpath("//input[@value='Delete']['+i+']")).click();
			Thread.sleep(5000);
			}
	
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
	public static void main(String[] args) {
		
		amazoncart amaz =new amazoncart();
		amaz.invokeBrowser2();
		
	}

}

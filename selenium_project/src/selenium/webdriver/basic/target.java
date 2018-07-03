package selenium.webdriver.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class target {
	WebDriver driver;

	
	public void invokeBrowser4()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kodali\\Downloads\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.target.com/");
			Thread.sleep(5000);
			searchCourse4();
		} catch (Exception e)
		{
						e.printStackTrace();
		}
	}
	
	public void searchCourse4(){
		//adding elements to the cart
		 try {
			driver.findElement(By.id("search")).sendKeys("tv stand");
			 driver.findElement(By.cssSelector("button[class='btn-search sc-fBuWsC dHzkrE']")).click();
			 List<WebElement> Ls2=driver.findElements(By.cssSelector("div[class='sc-eLExRp gpvJYw']"));
	
				for(int i=0; i<5; i++)
				{
					 try {
						WebElement wb2 =Ls2.get(i);
						wb2.click();
						Thread.sleep(5000);
						driver.findElement(By.className("yDgMK")).click();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
					driver.navigate().back();
					Thread.sleep(5000);
					Ls2=driver.findElements(By.className("sc-dfVpRl"));
					}
			   } 
				
				//deleting elements to the cart
				driver.findElement(By.id("cart")).click();
				 List<WebElement> Ls2remove=driver.findElements(By.className("iFurfD"));
				for(int i=0; i<5; i++)
				{
					try {
						WebElement wb2remove =Ls2.get(i);
						wb2remove.click();
						driver.findElement(By.xpath("//[@id='basicModal']//button[@class='remove-btn-modal']")).click();
				
						Thread.sleep(5000);
					Ls2remove=driver.findElements(By.className("iFurfD"));
	  				} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		target tar =new target();
		tar.invokeBrowser4();
		
	}

}

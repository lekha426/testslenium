package selenium.webdriver.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class walmartcart {

	
	WebDriver driver;

	
	public void invokeBrowser3()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kodali\\Downloads\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.walmart.com");
			Thread.sleep(5000);
			searchCourse3();
		} catch (Exception e)
		{
						e.printStackTrace();
		}
	}
	
	public void searchCourse3(){
		try {
		driver.findElement(By.id("global-search-input")).sendKeys("women tops");
		driver.findElement(By.xpath("//*[@id='global-search-form']//button[@type='submit']")).click();
	
			Thread.sleep(5000);
			 List<WebElement> ls= driver.findElements(By.className("Tile-img"));
		
		 for(int i=0;i<ls.size();i++)
		 {
			
			 WebElement wb =ls.get(i);
			 wb.click();
			 
			 try {
				 Thread.sleep(2000);
				driver.findElement(By.cssSelector("div[class='product-variant-tile product-informational-tile']")).click();
				 driver.findElement(By.className("prod-ProductCTA--primary")).click();
				 
				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO Auto-generated catch block
				
			} finally 
			{
				 driver.navigate().back();
				 Thread.sleep(2000);
				ls= driver.findElements(By.className("prod-ProductCard--Image"));
				
			}
			 
		 
		} }catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	public static void main(String[] args) {
		
		walmartcart wal =new walmartcart();
		wal.invokeBrowser3();
		
	}

}
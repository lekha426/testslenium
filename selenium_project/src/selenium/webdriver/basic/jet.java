package selenium.webdriver.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jet {

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
			driver.get("https://www.jet.com/");
			Thread.sleep(5000);
			searchCourse5();
		} catch (Exception e)
		{
						e.printStackTrace();
		}
	}
	
	public void searchCourse5(){
		try {
			boolean present;
			try {
				driver.findElement(By.id("bx-close-inside-672294"));
				present=true;
			} catch (Exception e1) {
			present=false;
				e1.printStackTrace();
			}
			
			try {
			if(present){
				Thread.sleep(8000);
				driver.findElement(By.id("bx-close-inside-672294")).click();
				
			}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				Thread.sleep(5000);
				driver.findElement(By.className("search-box")).sendKeys("snickers");
				driver.findElement(By.xpath("//[id='search']//href[@class='submit']/div[1]")).click();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		jet j =new jet();
		j.invokeBrowser4();
		
	}

}

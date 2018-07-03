package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame {
	
	@Test
	public void frame1(){
		try {
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.goibibo.com");
			driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
			Thread.sleep(5000);
			driver.switchTo().frame("authiframe");
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#authMobile")).sendKeys("9163608");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

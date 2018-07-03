package selenium.webdriver.basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alertnscreenshot  {
	
	//still to learn drag and drop, keyboard events, object repository, headless testing 
	//highlight text in selenium, log4j
	//capture page title, tooltip and error message
	
	
	@Test
	public void alert() throws IOException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ksrtc.in/oprs-web/");
		driver.findElement(By.id("searchBtn")).click();
		Alert al= driver.switchTo().alert();
		al.accept();
		//al.accept() which behaves like enter button
		//al.dismiss() which behaves like escape button
		driver.navigate().to("https://www.facebook.com");
         driver.findElement(By.id("email")).sendKeys("hrullekhakodali@gmail.com");
		
		TakesScreenshot ts=  (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./screenshots/facebook.png"));
		
		System.out.println("passed");
	}
	

}
